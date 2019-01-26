package state;

/**
 * 猛犸象，猛犸象有平静状态、暴怒状态等
 * <p>
 * Created by zhengwenzhan on 2019-01-26
 */
public class Mammoth {

    private State state;

    public Mammoth() {
        this.state = new PeacefulState(this);
    }

    public void timePasses() {
        if (state.getClass().equals(PeacefulState.class)) {
            changeStateTo(new AngryState(this));
        } else {
            changeStateTo(new PeacefulState(this));
        }
    }

    public void observe() {
        this.state.observe();
    }

    private void changeStateTo(State newState) {
        this.state = newState;
        this.state.onEnterState();
    }

    @Override
    public String toString() {
        return "this mammoth.";
    }
}
