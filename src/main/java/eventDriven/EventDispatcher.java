package eventDriven;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhengwenzhan on 2019-03-24
 */
public class EventDispatcher {
    private Map<Class<? extends Event>, Handler<? extends Event>> handlerMap;

    public EventDispatcher() {
        handlerMap = new HashMap<>();
    }

    public <E extends Event> void registerHandler(Class<E> eventType, Handler<E> handler) {
        handlerMap.put(eventType, handler);
    }

    public <E extends Event> void dispatcher(E eventType) {
        Handler<E> handler = (Handler<E>) handlerMap.get(eventType.getClass());

        if (handler != null) {
            handler.onEvent(eventType);
        }
    }
}
