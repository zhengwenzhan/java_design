package chain;

import lombok.Data;

/**
 * Created by zhengwenzhan on 2019-03-08
 */
@Data
public class Request {

    public Request(RequestType requestType, String requestDesc) {
        this.requestType = requestType;
        this.requestDesc = requestDesc;
    }

    private RequestType requestType;

    private String requestDesc;

    private Boolean handled;

    public void makeHandled() {
        this.handled = true;
    }

    @Override
    public String toString() {
        return getRequestDesc();
    }
}
