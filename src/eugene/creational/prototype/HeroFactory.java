package eugene.creational.prototype;

/**
 * Created by Jian on 2015/8/1.
 */
/**
 *
 * Interface for the factory class.
 *
 */
public interface HeroFactory {
    public Mage createMage();
    public Warlord createWarlord();
    public Beast createBeast();
}
