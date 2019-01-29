package abstractFactory;

/**
 * Created by zhengwenzhan on 2019-01-29
 */
public interface KingdomFactory {
    Castle createCastle();

    King createKing();

    Army createArmy();
}
