package delegation;

/**
 * Created by zhengwenzhan on 2019-03-15
 */
public class CanonPrinter implements Printer {
    @Override
    public void print(String str) {
        System.out.println(CanonPrinter.class.getSimpleName() + str);
    }
}
