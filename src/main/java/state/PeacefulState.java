package state;

import static util.PrintUtil.nyPrint;

/**
 * Created by zhengwenzhan on 2019-01-26
 */
public class PeacefulState implements State {

    private Mammoth mammoth;

    public PeacefulState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void onEnterState() {
        nyPrint(String.format("%s calms down.", mammoth));
    }

    @Override
    public void observe() {
        nyPrint(String.format("%s is calm down and peaceful.", mammoth));
    }
}
