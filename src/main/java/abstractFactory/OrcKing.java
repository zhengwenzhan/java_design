package abstractFactory;

/**
 * Created by zhengwenzhan on 2019-01-29
 */
public class OrcKing implements King {
    @Override
    public String getDescription() {
        return OrcKing.class.getSimpleName();
    }
}
