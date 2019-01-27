package strategy;

import static util.PrintUtil.nyPrint;

/**
 * Created by zhengwenzhan on 2019-01-27
 */
public class MeleeStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        nyPrint(MeleeStrategy.class.getSimpleName());
    }
}
