package eugene.creational.factorymethod;

/**
 * Created by Jian on 2015/8/1.
 */
public class OrcWeapon implements Weapon {
    private WeaponType weaponType;

    public OrcWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "Orcish " + weaponType;
    }
}
