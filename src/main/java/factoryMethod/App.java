package factoryMethod;

/**
 * Created by zhengwenzhan on 2019-01-28
 */
public class App {

    private final Blacksmith blacksmith;

    public App(Blacksmith blacksmith) {
        this.blacksmith = blacksmith;
    }

    public static void main(String[] args) {

        App app = new App(new OrcBlacksmith());
        app.manufactureWeapons();

        app = new App(new ElfBlacksmith());
        app.manufactureWeapons();
    }

    private void manufactureWeapons() {
        Weapon weapon;
        weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        System.out.println(weapon);
        weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        System.out.println(weapon);
    }
}
