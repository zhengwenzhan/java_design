package state;

/**
 * Created by zhengwenzhan on 2019-01-26
 */
public class App {
    public static void main(String[] args) {

        Mammoth mammoth = new Mammoth();
        mammoth.observe();
        mammoth.timePasses();
        mammoth.observe();
        mammoth.timePasses();
        mammoth.observe();
    }
}
