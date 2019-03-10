package chain;

/**
 * Created by zhengwenzhan on 2019-03-08
 */
public abstract class RequestHandler {

    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }


    public void handleRequest(Request req) {
        if (next != null) {
            next.handleRequest(req);
        }
    }

    public void printHandleLog(Request req) {
        System.out.println(this + " handling request " + req);
    }

    public abstract String toString();

}
