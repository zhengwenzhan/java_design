package eventDriven;

/**
 * Created by zhengwenzhan on 2019-03-24
 */
public class App {

    public static void main(String[] args) {
        EventDispatcher eventDispatcher = new EventDispatcher();
        eventDispatcher.registerHandler(UserCreatedEvent.class, new UserCreatedEventHandler());
        eventDispatcher.registerHandler(UserUpdatedEvent.class, new UserUpdatedEventHandler());

        User user = new User("wz");
        eventDispatcher.dispatcher(new UserCreatedEvent(user));
        eventDispatcher.dispatcher(new UserUpdatedEvent(user));
    }
}
