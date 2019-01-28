package factoryMethod;

/**
 * Created by zhengwenzhan on 2019-01-28
 */
public class OrcBlacksmith implements Blacksmith {
    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return new OrcWeapon(weaponType);
    }
}
