package bridge;

import static util.PrintUtil.nyPrint;

/**
 * Created by zhengwenzhan on 2019-01-28
 */
public class Strombringer extends SoulEatingMagicWeaponImpl {
    @Override
    public void eatSoulImpl() {
        nyPrint(Strombringer.class.getSimpleName() + "eatSoulImpl");
    }

    @Override
    public void wieldImpl() {
        nyPrint(Strombringer.class.getSimpleName() + "wieldImpl");
    }

    @Override
    public void swingImpl() {
        nyPrint(Strombringer.class.getSimpleName() + "swingImpl");
    }

    @Override
    public void unwieldImpl() {
        nyPrint(Strombringer.class.getSimpleName() + "unwieldImpl");
    }
}
