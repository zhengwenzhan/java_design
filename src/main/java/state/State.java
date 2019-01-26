package state;

/**
 * 状态接口
 * <p>
 * Created by zhengwenzhan on 2019-01-26
 */
public interface State {
    void onEnterState();

    void observe();
}
