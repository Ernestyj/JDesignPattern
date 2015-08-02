package eugene.behavioral.state;

/**
 * Created by Jian on 2015/8/2.
 */
/**
 *
 * State interface.
 *
 */
public interface State {
    public void onEnterState();
    public void observe();
}
