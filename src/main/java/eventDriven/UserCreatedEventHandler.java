package eventDriven;


/**
 * Created by zhengwenzhan on 2019-03-24
 */
public class UserCreatedEventHandler implements Handler<UserCreatedEvent> {
    @Override
    public void onEvent(UserCreatedEvent event) {
        System.out.println("deal user created event.");
    }
}
