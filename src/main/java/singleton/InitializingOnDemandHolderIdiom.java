package singleton;

/**
 * Created by zhengwenzhan on 2019-01-27
 */
public final class InitializingOnDemandHolderIdiom {

    /**
     * 私有化构造方法
     */
    private InitializingOnDemandHolderIdiom() {
    }

    public static InitializingOnDemandHolderIdiom getInstance() {
        return HelperHolder.INSTANCE;
    }

    private static class HelperHolder {
        private static final InitializingOnDemandHolderIdiom INSTANCE = new InitializingOnDemandHolderIdiom();
    }

}
