package eugene.behavioral.interceptingfilter;

/**
 * Created by Jian on 2015/8/12.
 */
/**
 * Filter Chain carries multiple filters and help to execute them in defined order on target.
 *
 * @author joshzambales
 */
public class FilterChain {

    private Filter chain;
    private final Target target;

    public FilterChain(Target target) {
        this.target = target;
    }

    public void addFilter(Filter filter) {
        if (chain == null) {
            chain = filter;
        } else {
            chain.getLast().setNext(filter);
        }
    }

    public String execute(Order order) {
        if (chain != null) {
            return chain.execute(order);
        } else {
            return "RUNNING...";
        }
    }
}
