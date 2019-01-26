package command;

/**
 * 哥布林，小妖怪，苦逼
 * Created by zhengwenzhan on 2019-01-26
 */
public class Goblin extends Target {

    public Goblin() {
        setSize(Size.NORMAL);
        setVisibility(Visibility.VISIBLE);
    }

    @Override
    public String toString() {
        return Goblin.class.getSimpleName();
    }
}
