package eugene.creational.property;

/**
 * Created by Jian on 2015/8/11.
 */
/**
 * Interface for prototype inheritance
 */
public interface Prototype {
    public Integer get(Stats stat);
    public boolean has(Stats stat);
    public void set(Stats stat, Integer val);
    public void remove(Stats stat);
}
