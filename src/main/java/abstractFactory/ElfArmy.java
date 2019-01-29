package abstractFactory;


/**
 * Created by zhengwenzhan on 2019-01-29
 */
public class ElfArmy implements Army {
    @Override
    public String getDescription() {
        return ElfArmy.class.getSimpleName();
    }
}
