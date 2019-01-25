package facade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DwarvenGoldmineFacade {

    private List<DwarvenMineWorker> dwarvenMineWorkers;

    public DwarvenGoldmineFacade() {
        dwarvenMineWorkers = new ArrayList<>();

        dwarvenMineWorkers.add(new DwarvenGoldDigger());
        dwarvenMineWorkers.add(new DwarvenCartOperator());
        dwarvenMineWorkers.add(new DwarvenTunnelDigger());

    }

    public void startNewDay() {
        makeActions(dwarvenMineWorkers, DwarvenMineWorker.Action.WAKE_UP, DwarvenMineWorker.Action.GO_TO_MINE);
    }

    public void digOutGold() {
        makeActions(dwarvenMineWorkers, DwarvenMineWorker.Action.WORK);
    }

    public void endDay() {
        makeActions(dwarvenMineWorkers, DwarvenMineWorker.Action.GO_HOME, DwarvenMineWorker.Action.GO_TO_SLEEP);
    }

    private static void makeActions(Collection<DwarvenMineWorker> workers, DwarvenMineWorker.Action... actions) {
        for (DwarvenMineWorker dwarvenMineWorker : workers) {
            dwarvenMineWorker.action(actions);
        }

    }

}
