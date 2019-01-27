package singleton;

/**
 * Created by zhengwenzhan on 2019-01-27
 */
public final class IvoryTower {

    private static final IvoryTower INSTANCE = new IvoryTower();

    /**
     * 私有化构造方法，避免类被实例化
     */
    private IvoryTower() {
    }

    public static IvoryTower getInstance() {
        return INSTANCE;
    }
}
