package command;

import static util.PrintUtil.nyPrint;

/**
 * Created by zhengwenzhan on 2019-01-26
 */
public abstract class Target {

    private Size size;

    private Visibility visibility;

    public abstract String toString();

    public void printStatus() {
        nyPrint(String.format("%s,[size=%s] , [visibility=%s]", this, getSize(), getVisibility()));
    }


    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }
}
