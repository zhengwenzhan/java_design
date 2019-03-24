package eventDriven;


/**
 * Created by zhengwenzhan on 2019-03-24
 */
public interface Handler<E extends Event> {
    void onEvent(E event);
}
