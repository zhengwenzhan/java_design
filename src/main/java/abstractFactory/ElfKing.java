package abstractFactory;

/**
 * Created by zhengwenzhan on 2019-01-29
 */
public class ElfKing implements King {
    @Override
    public String getDescription() {
        return ElfKing.class.getSimpleName();
    }
}
