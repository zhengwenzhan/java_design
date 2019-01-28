package bridge;

/**
 * Created by zhengwenzhan on 2019-01-28
 */
public abstract class MagicWeapon {
    protected MagicWeaponImpl impl;

    public MagicWeapon(MagicWeaponImpl impl) {
        this.impl = impl;
    }

    public abstract void wield();

    public abstract void swing();

    public abstract void unwield();

    public MagicWeaponImpl getImpl() {
        return impl;
    }

}
