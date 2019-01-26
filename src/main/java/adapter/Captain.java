package adapter;

/**
 * 指挥战斗的队长，客户端类
 * <p>
 * Created by zhengwenzhan on 2019-01-26
 */
public class Captain implements BattleShip {

    private BattleShip battleShip;

    public Captain(BattleShip battleShip) {
        this.battleShip = battleShip;
    }

    @Override
    public void fire() {
        battleShip.fire();
    }

    @Override
    public void move() {
        battleShip.move();
    }
}
