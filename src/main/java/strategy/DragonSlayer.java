package strategy;

/**
 * Created by zhengwenzhan on 2019-01-27
 */
public class DragonSlayer {
    private DragonSlayingStrategy dragonSlayingStrategy;

    public DragonSlayer(DragonSlayingStrategy dragonSlayingStrategy) {
        this.dragonSlayingStrategy = dragonSlayingStrategy;
    }

    public void changeStrategy(DragonSlayingStrategy dragonSlayingStrategy) {
        this.dragonSlayingStrategy = dragonSlayingStrategy;
    }

    public void goToBattle() {
        dragonSlayingStrategy.execute();
    }
}
