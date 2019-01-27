package singleton;

/**
 * effect java 2 ，基于enum方式的单例模式实现
 * <p>
 * Created by zhengwenzhan on 2019-01-27
 */
public enum EnumInvoryTower {

    INSTANCE;


    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }}
