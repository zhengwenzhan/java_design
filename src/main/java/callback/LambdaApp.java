package callback;

/**
 * Created by zhengwenzhan on 2019-03-15
 */
public class LambdaApp {
    public static void main(String[] args) {
        Callback callback = () -> System.out.println("call back lambda.");

        SimpleTask simpleTask = new SimpleTask();
        simpleTask.executeWith(callback);
    }
}
