package command;

import java.util.Deque;
import java.util.LinkedList;

import static util.PrintUtil.nyPrint;

/**
 *
 * 巫师，可以发送魔法命令
 *
 * Created by zhengwenzhan on 2019-01-26
 */
public class Wizard {

    private Deque<Command> undoStack = new LinkedList<>();

    private Deque<Command> redoStack = new LinkedList<>();


    public void castSpell(Command command, Target target) {
        nyPrint(this + " casts " + command + " at " + target);
        command.execute(target);
        undoStack.offerLast(command);
    }

    public void undoLastSpell() {
        if (!undoStack.isEmpty()) {
            Command previousSpell = undoStack.pollFirst();
            redoStack.offerLast(previousSpell);
            nyPrint(this + " undoes " + previousSpell);
            previousSpell.undo();
        }
    }

    public void redoLastSpell() {
        if (!redoStack.isEmpty()) {
            Command previousSpell = redoStack.pollLast();
            undoStack.offerLast(previousSpell);
            nyPrint(this + " redoes " + previousSpell);
            previousSpell.redo();
        }
    }

    @Override
    public String toString() {
        return Wizard.class.getSimpleName();
    }
}
