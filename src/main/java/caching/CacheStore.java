package caching;

import java.util.List;

/**
 * Created by zhengwenzhan on 2019-03-15
 */
public class CacheStore {

    static LruCache cache;

    private CacheStore() {
    }

    public static void initCapacity(int capacity) {
        if (null == cache) {
            cache = new LruCache(capacity);
        } else {
            cache.setCapacity(capacity);
        }
    }

    public static UserAccount readThrough(String userId) {
        if (cache.contains(userId)) {
            System.out.println("read from cache " + userId);
            return cache.get(userId);
        }

        System.out.println("read from db " + userId);
        UserAccount userAccount = DbManager.readFromDB(userId);
        cache.set(userId, userAccount);
        return userAccount;
    }

    public static void writeThrough(UserAccount userAccount) {
        if (cache.contains(userAccount.getUserId())) {
            DbManager.updateDB(userAccount);
        } else {
            DbManager.writeToDB(userAccount);
        }
        cache.set(userAccount.getUserId(), userAccount);
    }

    /**
     * Get user account using write-around cache
     */
    public static void writeAround(UserAccount userAccount) {
        if (cache.contains(userAccount.getUserId())) {
            DbManager.updateDB(userAccount);
            cache.invalidate(userAccount.getUserId()); // Cache data has been updated -- remove older
            // version from cache.
        } else {
            DbManager.writeToDB(userAccount);
        }
    }

    /**
     * Set user account
     */
    public static void writeBehind(UserAccount userAccount) {
        if (cache.isFull() && !cache.contains(userAccount.getUserId())) {
            System.out.println("# Cache is FULL! Writing LRU data to DB...");
            UserAccount toBeWrittenToDb = cache.getLruData();
            DbManager.upsertDB(toBeWrittenToDb);
        }
        cache.set(userAccount.getUserId(), userAccount);
    }


    /**
     * Get user account using read-through cache with write-back policy
     */
    public static UserAccount readThroughWithWriteBackPolicy(String userId) {
        if (cache.contains(userId)) {
            System.out.println("# Cache Hit!");
            return cache.get(userId);
        }
        System.out.println("# Cache Miss!");
        UserAccount userAccount = DbManager.readFromDB(userId);
        if (cache.isFull()) {
            System.out.println("# Cache is FULL! Writing LRU data to DB...");
            UserAccount toBeWrittenToDb = cache.getLruData();
            DbManager.upsertDB(toBeWrittenToDb);
        }
        cache.set(userId, userAccount);
        return userAccount;
    }


    /**
     * Clears cache
     */
    public static void clearCache() {
        if (null != cache) {
            cache.clear();
        }
    }

    /**
     * Writes remaining content in the cache into the DB.
     */
    public static void flushCache() {
        System.out.println("# flushCache...");
        if (null == cache) {
            return;
        }
        List<UserAccount> listOfUserAccounts = cache.getCacheDataInListForm();
        for (UserAccount userAccount : listOfUserAccounts) {
            DbManager.upsertDB(userAccount);
        }
    }

    /**
     * Print user accounts
     */
    public static String print() {
        List<UserAccount> listOfUserAccounts = cache.getCacheDataInListForm();
        StringBuilder sb = new StringBuilder();
        sb.append("\n--CACHE CONTENT--\n");
        for (UserAccount userAccount : listOfUserAccounts) {
            sb.append(userAccount.toString() + "\n");
        }
        sb.append("----\n");
        return sb.toString();
    }
}
