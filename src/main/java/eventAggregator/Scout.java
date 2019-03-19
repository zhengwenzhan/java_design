package eventAggregator;


/**
 * Created by zhengwenzhan on 2019-03-19
 */
public class Scout extends EventEmitter {
    public Scout() {
    }

    public Scout(EventObserver eventObserver) {
        super(eventObserver);
    }

    @Override
    public void timePasses(WeekDay weekDay) {
        if (weekDay.equals(WeekDay.TUESDAY)) {
            notifyObservers(Event.WARSHIPS_APPROACHING);
        }
    }
}
