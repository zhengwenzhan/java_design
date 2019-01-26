package command;

/**
 * Created by zhengwenzhan on 2019-01-26
 */
public enum Visibility {

    VISIBLE("visible"), INVISIBLE("invisile"), UNDEFINED("undefine");

    private String title;

    Visibility(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

}
