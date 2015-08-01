package eugene.creational.factorymethod;

/**
 * Created by Jian on 2015/8/1.
 */
/**
 *
 * Concrete subclass for creating new objects.
 *
 */
public class OrcBlacksmith implements Blacksmith {
    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return new OrcWeapon(weaponType);
    }
}
