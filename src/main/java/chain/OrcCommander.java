package chain;

/**
 * Created by zhengwenzhan on 2019-03-08
 */
public class OrcCommander extends RequestHandler {

    public OrcCommander(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.DEFEND_CASTLE)) {
            printHandleLog(req);
            req.makeHandled();
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "orc commander";
    }
}
