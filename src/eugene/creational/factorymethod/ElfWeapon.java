package eugene.creational.factorymethod;

/**
 * Created by Jian on 2015/8/1.
 */
public class ElfWeapon implements Weapon {
    private WeaponType weaponType;

    public ElfWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "Elven " + weaponType;
    }
}
