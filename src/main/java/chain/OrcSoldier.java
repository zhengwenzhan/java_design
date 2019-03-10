package chain;

/**
 * Created by zhengwenzhan on 2019-03-08
 */
public class OrcSoldier extends RequestHandler {

    public OrcSoldier(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.COLLECT_TAX)) {
            printHandleLog(req);
            req.makeHandled();
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "orc soldier";
    }
}
