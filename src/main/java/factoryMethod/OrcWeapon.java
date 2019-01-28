package factoryMethod;

/**
 * Created by zhengwenzhan on 2019-01-28
 */
public class OrcWeapon implements Weapon {
    private WeaponType weaponType;

    public OrcWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public WeaponType getWeaponType() {
        return weaponType;
    }

    @Override
    public String toString() {
        return "Orcish " + weaponType;
    }
}
