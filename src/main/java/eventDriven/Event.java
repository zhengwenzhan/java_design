package eventDriven;

/**
 * Created by zhengwenzhan on 2019-03-24
 */
public interface Event {
    Class<? extends Event> getType();
}
