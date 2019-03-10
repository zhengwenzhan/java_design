package chain;

/**
 * Created by zhengwenzhan on 2019-03-08
 */
public class OrcOfficer extends RequestHandler {
    public OrcOfficer(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.TORTURE_PRISONER)) {
            printHandleLog(req);
            req.makeHandled();
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "orc officer";
    }
}
