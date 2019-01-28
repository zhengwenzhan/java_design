package builder;

/**
 * Created by zhengwenzhan on 2019-01-28
 */
public enum Profession {
    WARRIOR, THIEF, MAGE, PRIEST;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
