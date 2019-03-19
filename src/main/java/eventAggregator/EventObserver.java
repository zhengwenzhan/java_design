package eventAggregator;

/**
 * Created by zhengwenzhan on 2019-03-19
 */
public interface EventObserver {

    void onEvent(Event event);
}
