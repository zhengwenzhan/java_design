package state;

import static util.PrintUtil.nyPrint;

/**
 * Created by zhengwenzhan on 2019-01-26
 */
public class AngryState implements State {
    private Mammoth mammoth;

    public AngryState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void onEnterState() {
        nyPrint(String.format("%s gets angry.", mammoth));
    }

    @Override
    public void observe() {
        nyPrint(String.format("%s is furious.", mammoth));
    }
}
