package delegation;

public class App {

    public static final String MESSAGE_TO_PRINT = "hello world";

    /**
     * Program entry point
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        PrintController hpPrinterController = new PrintController(new HpPrinter());
        PrintController canonPrinterController = new PrintController(new CanonPrinter());
        PrintController epsonPrinterController = new PrintController(new EpsonPrinter());

        hpPrinterController.print(MESSAGE_TO_PRINT);
        canonPrinterController.print(MESSAGE_TO_PRINT);
        epsonPrinterController.print(MESSAGE_TO_PRINT);
    }

}
