package factoryMethod;

/**
 * Created by zhengwenzhan on 2019-01-28
 */
public class ElfBlacksmith implements Blacksmith {

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return new ElfWeapon(weaponType);
    }
}
