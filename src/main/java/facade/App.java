package facade;

public class App {

    public static void main(String[] args) {

        DwarvenGoldmineFacade dwarvenGoldmineFacade = new DwarvenGoldmineFacade();
        dwarvenGoldmineFacade.startNewDay();
        dwarvenGoldmineFacade.digOutGold();
        dwarvenGoldmineFacade.endDay();

    }
}
