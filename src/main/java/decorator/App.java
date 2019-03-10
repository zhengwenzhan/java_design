package decorator;

import util.PrintUtil;

/**
 * Created by zhengwenzhan on 2019-03-10
 */
public class App {
    public static void main(String[] args) {
        Hostile troll = new Troll();
        troll.attack();
        troll.fleeBattle();
        PrintUtil.nyPrint("troll power = " + troll.getAttackPower());


        Hostile smart = new SmartHotile(troll);
        smart.attack();
        smart.fleeBattle();
        PrintUtil.nyPrint("smart power = " + smart.getAttackPower());

    }
}
