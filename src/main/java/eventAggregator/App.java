package eventAggregator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengwenzhan on 2019-03-19
 */
public class App {

    public static void main(String[] args) {
        KingJoffrey kingJoffrey = new KingJoffrey();
        KingsHand kingsHand = new KingsHand(kingJoffrey);

        List<EventEmitter> eventEmitters = new ArrayList<>();
        eventEmitters.add(kingsHand);
        eventEmitters.add(new LordBaelish(kingsHand));
        eventEmitters.add(new LordVarys(kingsHand));
        eventEmitters.add(new Scout(kingsHand));


        for (WeekDay day : WeekDay.values()) {
            for (EventEmitter emitter : eventEmitters) {
                emitter.timePasses(day);
            }
        }
    }
}
