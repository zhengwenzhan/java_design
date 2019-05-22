package studyjvm;

/**
 * Created by zhengwenzhan on 2019-05-16
 */
public class TryCatchFinally {

    public static void main(String[] args) {
        int x = test();

        System.out.println(x);

    }


    private static int test() {
        int x;
        try {
            x = 1;
            return x;
        } catch (Exception e) {
            x = 2;
            return x;
        } finally {
            x = 3;
        }
    }
}
