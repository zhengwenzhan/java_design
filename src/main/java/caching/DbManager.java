package caching;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.UpdateOptions;
import org.bson.Document;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhengwenzhan on 2019-03-15
 */
public final class DbManager {
    private static MongoClient mongoClient;
    private static MongoDatabase db;
    private static boolean useMongoDB;

    private static Map<String, UserAccount> virtualDB;

    private DbManager() {
    }

    public static void createVirtualDB() {
        useMongoDB = false;
        virtualDB = new HashMap<>();
    }

    public static void connect() {
        useMongoDB = true;
        mongoClient = new MongoClient();
        db = mongoClient.getDatabase("test");
    }

    public static UserAccount readFromDB(String userId) {
        if (!useMongoDB) {
            if (virtualDB.containsKey(userId)) {
                return virtualDB.get(userId);
            } else {
                return null;
            }
        }

        FindIterable<Document> iterable = db.getCollection("user_accounts").find(new Document("userID", userId));

        if (null == iterable) {
            return null;
        }

        Document document = iterable.first();
        return new UserAccount(userId, document.getString("userName"), document.getString("additionalInfo"));
    }

    public static void writeToDB(UserAccount userAccount) {
        if (!useMongoDB) {
            virtualDB.put(userAccount.getUserId(), userAccount);
            return;
        }

        db.getCollection("user_accounts").insertOne(
                new Document("userID", userAccount.getUserId()).append("userName",
                        userAccount.getUserName()).append("additionalInfo", userAccount.getAdditionalInfo()));
    }

    public static void updateDB(UserAccount userAccount) {
        if (!useMongoDB) {
            virtualDB.put(userAccount.getUserId(), userAccount);
            return;
        }

        db.getCollection("user_accounts").updateOne(
                new Document("userID", userAccount.getUserId()),
                new Document("$set", new Document("userName", userAccount.getUserName()).append(
                        "additionalInfo", userAccount.getAdditionalInfo())));
    }

    public static void upsertDB(UserAccount userAccount) {
        if (!useMongoDB) {
            virtualDB.put(userAccount.getUserId(), userAccount);
            return;
        }

        db.getCollection("user_accounts").updateOne(
                new Document("userID", userAccount.getUserId()),
                new Document("$set", new Document("userID", userAccount.getUserId()).append("userName",
                        userAccount.getUserName()).append("additionalInfo", userAccount.getAdditionalInfo())),
                new UpdateOptions().upsert(true));
    }

}
