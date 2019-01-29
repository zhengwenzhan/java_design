package abstractFactory;

import lombok.Data;

/**
 * Created by zhengwenzhan on 2019-01-29
 */
@Data
public class App {

    private King king;
    private Castle castle;
    private Army army;

    /**
     * Creates kingdom
     */
    public void createKingdom(final KingdomFactory factory) {
        setKing(factory.createKing());
        setCastle(factory.createCastle());
        setArmy(factory.createArmy());
    }

    /**
     * Program entry point
     *
     * @param args command line args
     */
    public static void main(String[] args) {

        App app = new App();

        System.out.println("Elf Kingdom");
        app.createKingdom(new ElfKingdomFactory());
        System.out.println(app.getArmy().getDescription());
        System.out.println(app.getCastle().getDescription());
        System.out.println(app.getKing().getDescription());

        System.out.println("\nOrc Kingdom");
        app.createKingdom(new OrcKingdomFactory());
        System.out.println(app.getArmy().getDescription());
        System.out.println(app.getCastle().getDescription());
        System.out.println(app.getKing().getDescription());

    }
}
