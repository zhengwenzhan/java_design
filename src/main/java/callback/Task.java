package callback;

/**
 * Created by zhengwenzhan on 2019-03-15
 */
public abstract class Task {

    public void executeWith(Callback callback) {
        execute();
        callback.call();
    }

    public abstract void execute();
}
