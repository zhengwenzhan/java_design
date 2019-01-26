package adapter;


import static util.PrintUtil.nyPrint;

/**
 * apter 适配器类，用来将老的接口适配成满足新接口需求，
 * <p>
 * 战斗渔船需要移动和开火，但渔船只能扬帆和捕鱼。。。
 */
public class BattleFinishingBoat implements BattleShip {

    private FinishBoat finishBoat;

    public BattleFinishingBoat() {
        this.finishBoat = new FinishBoat();
    }

    @Override
    public void fire() {
        nyPrint("fire.");
    }

    @Override
    public void move() {
        finishBoat.sail();
    }
}
