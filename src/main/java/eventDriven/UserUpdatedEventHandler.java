package eventDriven;

/**
 * Created by zhengwenzhan on 2019-03-24
 */
public class UserUpdatedEventHandler implements Handler<UserUpdatedEvent> {
    @Override
    public void onEvent(UserUpdatedEvent event) {
        System.out.println("deal user update event.");
    }
}
