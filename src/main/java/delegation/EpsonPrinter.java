package delegation;

/**
 * Created by zhengwenzhan on 2019-03-15
 */
public class EpsonPrinter implements Printer {

    @Override
    public void print(String str) {
        System.out.println(EpsonPrinter.class.getSimpleName() + str);
    }
}
