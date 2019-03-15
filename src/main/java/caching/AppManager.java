package caching;


/**
 * Created by zhengwenzhan on 2019-03-15
 */
public class AppManager {

    private static CachingPolicy cachingPolicy;

    public static void initDB(boolean useMongoDb) {
        if (useMongoDb) {
            DbManager.connect();
        } else {
            DbManager.createVirtualDB();
        }
    }

    /**
     * Initialize caching policy
     */
    public static void initCachingPolicy(CachingPolicy policy) {
        cachingPolicy = policy;
        if (cachingPolicy == CachingPolicy.BEHIND) {
            Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
                @Override
                public void run() {
                    CacheStore.flushCache();
                }
            }));
        }
        CacheStore.clearCache();
    }

    public static void initCacheCapacity(int capacity) {
        CacheStore.initCapacity(capacity);
    }

    /**
     * Find user account
     */
    public static UserAccount find(String userId) {
        if (cachingPolicy == CachingPolicy.THROUGH || cachingPolicy == CachingPolicy.AROUND) {
            return CacheStore.readThrough(userId);
        } else if (cachingPolicy == CachingPolicy.BEHIND) {
            return CacheStore.readThroughWithWriteBackPolicy(userId);
        }
        return null;
    }


    /**
     * Save user account
     */
    public static void save(UserAccount userAccount) {
        if (cachingPolicy == CachingPolicy.THROUGH) {
            CacheStore.writeThrough(userAccount);
        } else if (cachingPolicy == CachingPolicy.AROUND) {
            CacheStore.writeAround(userAccount);
        } else if (cachingPolicy == CachingPolicy.BEHIND) {
            CacheStore.writeBehind(userAccount);
        }
    }

    public static String printCacheContent() {
        return CacheStore.print();
    }

}
