package command;

/**
 *
 * 命令抽象类，在这里表现为咒语
 *
 * Created by zhengwenzhan on 2019-01-26
 */
public abstract class Command {

    public abstract void execute(Target target);

    public abstract void undo();

    public abstract void redo();

    @Override
    public abstract String toString();
}
