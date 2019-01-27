package singleton;

/**
 * 二次校验的懒汉式加载单例模式
 * <p>
 * Created by zhengwenzhan on 2019-01-27
 */
public final class ThreadSafeDoubleCheckLocking {
    private static volatile ThreadSafeDoubleCheckLocking instance;

    private ThreadSafeDoubleCheckLocking() {
        if (instance != null) {
            throw new RuntimeException("instance already initial");
        }
    }

    public static ThreadSafeDoubleCheckLocking getInstance() {
        ThreadSafeDoubleCheckLocking result = instance;

        if (result == null) {

            synchronized (ThreadSafeDoubleCheckLocking.class) {

                //先赋值，不然第二个线程进来的时候会在初始化一遍
                result = instance;

                if (result == null) {
                    instance = result = new ThreadSafeDoubleCheckLocking();
                }

            }
        }
        return result;
    }

}
