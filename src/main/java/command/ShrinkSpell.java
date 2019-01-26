package command;

/**
 *
 * 变形咒语
 *
 * Created by zhengwenzhan on 2019-01-26
 */
public class ShrinkSpell extends Command {

    private Target target;

    private Size oldSize;

    @Override
    public void execute(Target target) {
        oldSize = target.getSize();
        this.target = target;
        target.setSize(Size.SMALL);
    }

    @Override
    public void undo() {
        if (oldSize != null && target != null) {
            Size temp = target.getSize();
            target.setSize(oldSize);
            oldSize = temp;
        }
    }

    @Override
    public void redo() {
        undo();
    }

    @Override
    public String toString() {
        return ShrinkSpell.class.getSimpleName();
    }
}
