package abstractFactory;


/**
 * Created by zhengwenzhan on 2019-01-29
 */
public class OrcCastle implements Castle {
    @Override
    public String getDescription() {
        return OrcCastle.class.getSimpleName();
    }
}
