package businessDelegate;

import util.PrintUtil;

/**
 * Created by zhengwenzhan on 2019-03-13
 */
public class EjbService implements BusinessService {

    public void service() {
        PrintUtil.nyPrint("ejb service.");
    }
}
