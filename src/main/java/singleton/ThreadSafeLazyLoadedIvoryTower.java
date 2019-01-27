package singleton;

/**
 * Created by zhengwenzhan on 2019-01-27
 */
public final class ThreadSafeLazyLoadedIvoryTower {
    /**
     * 私有化构造方法
     */
    private ThreadSafeLazyLoadedIvoryTower() {
    }

    private static ThreadSafeLazyLoadedIvoryTower instance;

    /**
     * 利用关键字初始化
     *
     * @return
     */
    public static synchronized ThreadSafeLazyLoadedIvoryTower getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazyLoadedIvoryTower();
        }
        return instance;
    }

}
