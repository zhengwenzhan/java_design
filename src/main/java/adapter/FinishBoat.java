package adapter;


import static util.PrintUtil.nyPrint;

/**
 * 老的接口，只有渔船可以用，渔船只有两个接口，需要被适配到新的接口
 */
public class FinishBoat {
    public void sail() {
        nyPrint("The boat is moving to that place.");
    }

    public void fish() {
        nyPrint("just fish.");
    }

}
