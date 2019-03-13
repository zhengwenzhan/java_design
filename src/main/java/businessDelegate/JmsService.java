package businessDelegate;

import util.PrintUtil;

/**
 * Created by zhengwenzhan on 2019-03-13
 */
public class JmsService implements BusinessService{
    public void service() {
        PrintUtil.nyPrint("jsm service");
    }
}
