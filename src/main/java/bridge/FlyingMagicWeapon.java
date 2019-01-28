package bridge;

/**
 * Created by zhengwenzhan on 2019-01-28
 */
public class FlyingMagicWeapon extends MagicWeapon {

    public FlyingMagicWeapon(FlyingMagicWeaponImpl impl) {
        super(impl);
    }

    @Override
    public FlyingMagicWeaponImpl getImpl() {
        return (FlyingMagicWeaponImpl)impl;
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

    public void fly() {
        getImpl().flyImpl();
    }
}
