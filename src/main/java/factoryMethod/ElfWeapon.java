package factoryMethod;


/**
 * Created by zhengwenzhan on 2019-01-28
 */
public class ElfWeapon implements Weapon {
    private WeaponType weaponType;

    public ElfWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public WeaponType getWeaponType() {
        return weaponType;
    }

    @Override
    public String toString() {
        return "Eleven " + weaponType;
    }
}
