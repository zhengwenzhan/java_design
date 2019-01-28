package builder;

/**
 * Created by zhengwenzhan on 2019-01-28
 */
public enum HairColor {
    WHITE, BLOND, RED, BROWN, BLACK;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}
