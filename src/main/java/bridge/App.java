package bridge;

/**
 * 桥接模式，适用于两种维度，都需要扩展的情况
 * <p>
 * Created by zhengwenzhan on 2019-01-28
 */
public class App {
    public static void main(String[] args) {
        BlindingMagicWeapon blindingMagicWeapon = new BlindingMagicWeapon(new Excalibur());
        blindingMagicWeapon.wield();
        blindingMagicWeapon.blinding();
        blindingMagicWeapon.swing();
        blindingMagicWeapon.unwield();

        FlyingMagicWeapon flyingMagicWeapon = new FlyingMagicWeapon(new Mjollnir());
        flyingMagicWeapon.wield();
        flyingMagicWeapon.fly();
        flyingMagicWeapon.swing();
        flyingMagicWeapon.unwield();

        SoulEatingMagicWeapon soulEatingMagicWeapon = new SoulEatingMagicWeapon(new Strombringer());
        soulEatingMagicWeapon.wield();
        soulEatingMagicWeapon.eatSoul();
        soulEatingMagicWeapon.swing();
        soulEatingMagicWeapon.unwield();
    }
}
