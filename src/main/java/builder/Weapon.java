package builder;

/**
 * Created by zhengwenzhan on 2019-01-28
 */
public enum Weapon {
    DAGGER, SWORD, AXE, WARHAMMER, BOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
