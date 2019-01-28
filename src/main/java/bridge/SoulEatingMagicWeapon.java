package bridge;

/**
 * Created by zhengwenzhan on 2019-01-28
 */
public class SoulEatingMagicWeapon extends MagicWeapon {

    public SoulEatingMagicWeapon(SoulEatingMagicWeaponImpl impl) {
        super(impl);
    }

    @Override
    public SoulEatingMagicWeaponImpl getImpl() {
        return (SoulEatingMagicWeaponImpl) impl;
    }

    @Override
    public void wield() {
        getImpl().wieldImpl();
    }

    @Override
    public void swing() {
        getImpl().swingImpl();
    }

    @Override
    public void unwield() {
        getImpl().unwieldImpl();
    }

    public void eatSoul() {
        getImpl().eatSoulImpl();
    }
}
