package strategy;

import static util.PrintUtil.nyPrint;

/**
 * Created by zhengwenzhan on 2019-01-27
 */
public class ProjectileStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        nyPrint(ProjectileStrategy.class.getSimpleName());
    }
}
