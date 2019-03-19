package eventAggregator;

/**
 * Created by zhengwenzhan on 2019-03-19
 */
public enum WeekDay {
    MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY("Thursday"), FRIDAY(
            "Friday"), SATURDAY("Saturday"), SUNDAY("Sunday");

    private String description;

    WeekDay(String description) {
        this.description = description;
    }

    public String toString() {
        return description;
    }
}
