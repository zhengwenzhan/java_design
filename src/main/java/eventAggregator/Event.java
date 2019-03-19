package eventAggregator;

/**
 * Created by zhengwenzhan on 2019-03-19
 */
public enum Event {
    STARK_SIGHTED("Stark sighted"), WARSHIPS_APPROACHING("Warships approaching"), TRAITOR_DETECTED("Traitor detected");

    private String description;

    Event(String description) {
        this.description = description;
    }

    public String toString() {
        return description;
    }
}
