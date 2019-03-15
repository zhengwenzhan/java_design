package delegation;


/**
 * Created by zhengwenzhan on 2019-03-15
 */
public class PrintController implements Printer {

    private final Printer printer;

    public PrintController(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String str) {
        printer.print(str);
    }
}
