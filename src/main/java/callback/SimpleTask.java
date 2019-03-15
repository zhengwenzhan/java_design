package callback;


/**
 * Created by zhengwenzhan on 2019-03-15
 */

public class SimpleTask extends Task {

    @Override
    public void execute() {
        System.out.println(SimpleTask.class.getSimpleName() + " execute ");
    }
}
