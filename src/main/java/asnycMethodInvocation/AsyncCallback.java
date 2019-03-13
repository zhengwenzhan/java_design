package asnycMethodInvocation;

import java.util.Optional;

/**
 * Created by zhengwenzhan on 2019-03-13
 */
public interface AsyncCallback<T> {

    void onComplete(T value, Optional<Exception> ex);
}
