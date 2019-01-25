package facade;

public class DwarvenGoldDigger extends DwarvenMineWorker {
    @Override
    public String name() {
        return "DwarvenGoldDigger";
    }

    @Override
    public void work() {
        System.out.println(name() + " digs for gold.");
    }
}
