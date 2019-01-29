package abstractFactory;

/**
 * Created by zhengwenzhan on 2019-01-29
 */
public class OrcArmy implements Army {
    @Override
    public String getDescription() {
        return OrcArmy.class.getSimpleName();
    }
}
