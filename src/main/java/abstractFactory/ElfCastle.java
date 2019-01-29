package abstractFactory;

/**
 * Created by zhengwenzhan on 2019-01-29
 */
public class ElfCastle implements Castle {
    @Override
    public String getDescription() {
        return ElfCastle.class.getSimpleName();
    }
}
