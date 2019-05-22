package studyjvm;

/**
 * Created by zhengwenzhan on 2019-05-21
 */
public class ConstantClass {
    static {
        System.out.println("constant class init");
    }

    public static final String HELLO = "hello world";
}
