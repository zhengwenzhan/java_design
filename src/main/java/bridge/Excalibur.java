package bridge;

import static util.PrintUtil.nyPrint;

/**
 * Created by zhengwenzhan on 2019-01-28
 */
public class Excalibur extends BlindingMagicWeaponImpl {
    @Override
    public void blindImpl() {
        nyPrint(Excalibur.class.getSimpleName() + "blindImpl.");
    }

    @Override
    public void wieldImpl() {
        nyPrint(Excalibur.class.getSimpleName() + "wieldImpl.");
    }

    @Override
    public void swingImpl() {
        nyPrint(Excalibur.class.getSimpleName() + "swingImpl.");
    }

    @Override
    public void unwieldImpl() {
        nyPrint(Excalibur.class.getSimpleName() + "unwieldImpl.");
    }
}
