package eventDriven;

/**
 * Created by zhengwenzhan on 2019-03-24
 */
public class UserCreatedEvent extends AbstractEvent {
    private User user;

    public UserCreatedEvent(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
