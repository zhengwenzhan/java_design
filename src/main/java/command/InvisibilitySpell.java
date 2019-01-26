package command;

/**
 *
 * 隐形咒语
 *
 * Created by zhengwenzhan on 2019-01-26
 */
public class InvisibilitySpell extends Command {

    private Target target;

    @Override
    public void execute(Target target) {
        target.setVisibility(Visibility.INVISIBLE);
        this.target = target;
    }

    @Override
    public void undo() {
        if (target != null) {
            target.setVisibility(Visibility.VISIBLE);
        }

    }

    @Override
    public void redo() {
        if (target != null) {
            target.setVisibility(Visibility.INVISIBLE);
        }

    }

    @Override
    public String toString() {
        return InvisibilitySpell.class.getSimpleName();
    }
}
