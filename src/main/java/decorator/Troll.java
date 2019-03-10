package decorator;

import util.PrintUtil;

/**
 * Created by zhengwenzhan on 2019-03-10
 */
public class Troll implements Hostile {
    @Override
    public void attack() {
        PrintUtil.nyPrint(Troll.class.getSimpleName() + " attack");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public void fleeBattle() {
        PrintUtil.nyPrint(Troll.class.getSimpleName() + " fleeBattle");
    }
}
