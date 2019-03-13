package asnycMethodInvocation;

import java.util.concurrent.ExecutionException;

/**
 * Created by zhengwenzhan on 2019-03-13
 */
public interface AsyncResult<T> {

    boolean isCompleted();

    T getValue() throws ExecutionException;

    void await() throws InterruptedException;
}
