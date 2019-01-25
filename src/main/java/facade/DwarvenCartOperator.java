package facade;

public class DwarvenCartOperator extends DwarvenMineWorker {
    @Override
    public String name() {
        return "DwarvenCartOperator";
    }

    @Override
    public void work() {
        System.out.println(name() + " cart operator.");
    }
}
