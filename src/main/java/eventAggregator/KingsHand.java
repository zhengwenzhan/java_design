package eventAggregator;

/**
 * Created by zhengwenzhan on 2019-03-19
 */
public class KingsHand extends EventEmitter implements EventObserver {

    public KingsHand() {
    }

    public KingsHand(EventObserver eventObserver) {
        super(eventObserver);
    }

    @Override
    public void timePasses(WeekDay weekDay) {

    }

    @Override
    public void onEvent(Event event) {
        notifyObservers(event);
    }
}
