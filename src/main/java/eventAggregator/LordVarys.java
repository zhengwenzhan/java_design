package eventAggregator;

/**
 * Created by zhengwenzhan on 2019-03-19
 */
public class LordVarys extends EventEmitter {
    public LordVarys() {
    }

    public LordVarys(EventObserver eventObserver) {
        super(eventObserver);
    }

    @Override
    public void timePasses(WeekDay weekDay) {
        if (weekDay.equals(WeekDay.SATURDAY)) {
            notifyObservers(Event.TRAITOR_DETECTED);
        }
    }
}
