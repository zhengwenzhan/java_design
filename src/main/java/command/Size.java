package command;

/**
 * Created by zhengwenzhan on 2019-01-26
 */
public enum Size {

    SMALL("small"), NORMAL("normal"), LARGE("large"), UNDEFINED("");

    private String title;

    Size(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return title;
    }}
