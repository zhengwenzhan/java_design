package bridge;

/**
 * Created by zhengwenzhan on 2019-01-28
 */
public class BlindingMagicWeapon extends MagicWeapon {
    public BlindingMagicWeapon(BlindingMagicWeaponImpl impl) {
        super(impl);
    }

    @Override
    public BlindingMagicWeaponImpl getImpl() {
        return (BlindingMagicWeaponImpl) impl;
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

    public void blinding() {
        getImpl().blindImpl();
    }
}
