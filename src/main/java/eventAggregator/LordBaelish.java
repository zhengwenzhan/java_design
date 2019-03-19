package eventAggregator;

/**
 * Created by zhengwenzhan on 2019-03-19
 */
public class LordBaelish extends EventEmitter {
    public LordBaelish(EventObserver eventObserver) {
        super(eventObserver);
    }

    public LordBaelish() {
    }

    @Override
    public void timePasses(WeekDay weekDay) {
        if (weekDay.equals(WeekDay.FRIDAY)) {
            notifyObservers(Event.STARK_SIGHTED);
        }
    }
}
