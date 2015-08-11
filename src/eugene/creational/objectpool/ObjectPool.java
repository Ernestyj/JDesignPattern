package eugene.creational.objectpool;

import java.util.HashSet;

/**
 * Created by Jian on 2015/8/11.
 */
/**
 *
 * Generic object pool
 *
 * @param <T>
 */
abstract public class ObjectPool<T> {
    private HashSet<T> available = new HashSet<>();
    private HashSet<T> inUse = new HashSet<>();

    abstract protected T create();

    public synchronized T checkOut() {
        if (available.size() <= 0) {
            available.add(create());
        }
        T instance = available.iterator().next();
        available.remove(instance);
        inUse.add(instance);
        return instance;
    }

    public synchronized void checkIn(T instance) {
        inUse.remove(instance);
        available.add(instance);
    }

    @Override
    public String toString() {
        return String.format("Pool available=%d inUse=%d", available.size(), inUse.size());
    }
}
