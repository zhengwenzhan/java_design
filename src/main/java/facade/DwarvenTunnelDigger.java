package facade;

public class DwarvenTunnelDigger extends DwarvenMineWorker {
    @Override
    public String name() {
        return "DwarvenTunnelDigger";
    }

    @Override
    public void work() {
        System.out.println(name() + " tunnel");
    }
}
