package eugene.creational.singleton;

/**
 * Created by Jian on 2015/7/29.
 */
/**
 *
 * Enum Singleton class.
 * Effective Java 2nd Edition (Joshua Bloch) p. 18
 *
 */
public enum EnumIvoryTower {
    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}