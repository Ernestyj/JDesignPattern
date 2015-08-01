package eugene.creational.factorymethod;

/**
 * Created by Jian on 2015/8/1.
 */
/**
 *
 * The interface containing method for producing objects.
 *
 */
public interface Blacksmith {
    public Weapon manufactureWeapon(WeaponType type);
}
