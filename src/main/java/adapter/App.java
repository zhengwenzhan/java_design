package adapter;

public class App {

    public static void main(String[] args) {
        Captain captain = new Captain(new BattleFinishingBoat());
        captain.move();
        captain.fire();
    }
}
