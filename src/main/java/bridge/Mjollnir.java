package bridge;

import static util.PrintUtil.nyPrint;

/**
 * Created by zhengwenzhan on 2019-01-28
 */
public class Mjollnir extends FlyingMagicWeaponImpl {
    @Override
    public void wieldImpl() {
        nyPrint(Mjollnir.class.getSimpleName() + "wieldImpl.");
    }

    @Override
    public void swingImpl() {
        nyPrint(Mjollnir.class.getSimpleName() + "swingImpl.");

    }

    @Override
    public void unwieldImpl() {
        nyPrint(Mjollnir.class.getSimpleName() + "unwieldImpl.");
    }

    @Override
    public void flyImpl() {
        nyPrint(Mjollnir.class.getSimpleName() + "flyImpl.");
    }
}
