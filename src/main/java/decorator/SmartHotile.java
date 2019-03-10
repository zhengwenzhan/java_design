package decorator;

import util.PrintUtil;

/**
 * Created by zhengwenzhan on 2019-03-10
 */
public class SmartHotile implements Hostile {
    private Hostile decorator;

    public SmartHotile(Hostile hostile) {
        this.decorator = hostile;
    }

    @Override
    public void attack() {
        decorator.attack();
        PrintUtil.nyPrint(SmartHotile.class.getSimpleName() + " attack.");
    }

    @Override
    public int getAttackPower() {
        return decorator.getAttackPower() + 10;
    }

    @Override
    public void fleeBattle() {
        decorator.fleeBattle();
        PrintUtil.nyPrint(SmartHotile.class.getSimpleName() + " fleeBattle.");

    }
}
