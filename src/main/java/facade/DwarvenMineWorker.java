package facade;


/**
 * 矿工类，有睡觉、醒来、回家、去矿场的行为，真TM苦逼。。。
 * <p>
 * 另外两个抽象方法，name表示名字，work表示所做的行为
 */
public abstract class DwarvenMineWorker {


    public void goToSleep() {
        System.out.println(name() + " goes to sleep.");
    }

    public void wakeUp() {
        System.out.println(name() + " wake up.");
    }

    public void goHome() {
        System.out.println(name() + " goes home.");
    }

    public void goToMine() {
        System.out.println(name() + " goes to the mine.");
    }

    public void action(Action... actions) {

        for (Action action : actions) {
            action(action);
        }

    }

    private void action(Action action) {
        switch (action) {
            case GO_TO_SLEEP:
                goToSleep();
                break;
            case WAKE_UP:
                wakeUp();
                break;
            case GO_HOME:
                goHome();
                break;
            case GO_TO_MINE:
                goToMine();
                break;
            case WORK:
                work();
                break;
            default:
                System.out.println("Undefined action.");
                break;
        }
    }


    public abstract String name();

    public abstract void work();

    static enum Action {
        GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_MINE, WORK
    }

}
