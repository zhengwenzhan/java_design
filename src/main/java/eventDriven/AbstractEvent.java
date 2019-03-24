package eventDriven;

/**
 * Created by zhengwenzhan on 2019-03-24
 */
public abstract class AbstractEvent implements Event {
    @Override
    public Class<? extends Event> getType() {
        return getClass();
    }
}
