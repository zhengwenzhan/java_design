package eventAggregator;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhengwenzhan on 2019-03-19
 */
public abstract class EventEmitter {

    private List<EventObserver> observers;

    public EventEmitter() {
        observers = new LinkedList<>();
    }

    public EventEmitter(EventObserver eventObserver) {
        this();
        registerObserver(eventObserver);
    }

    public final void registerObserver(EventObserver observer) {
        observers.add(observer);
    }

    protected void notifyObservers(Event event) {
        observers.forEach(observer -> {
            observer.onEvent(event);
        });
    }

    public abstract void timePasses(WeekDay weekDay);

}
