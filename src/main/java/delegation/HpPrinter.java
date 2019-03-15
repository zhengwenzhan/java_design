package delegation;

import util.PrintUtil;

/**
 * Created by zhengwenzhan on 2019-03-15
 */
public class HpPrinter implements Printer {

    @Override
    public void print(String str) {
        PrintUtil.nyPrint(HpPrinter.class.getSimpleName() + str);
    }
}
