package callback;

/**
 * Created by zhengwenzhan on 2019-03-15
 */
public class App {
    public static void main(String[] args) {
        Callback callback = new Callback() {
            @Override
            public void call() {
                System.out.println("call back java 7.");
            }
        };

        Task task = new SimpleTask();
        task.executeWith(callback);
    }
}
