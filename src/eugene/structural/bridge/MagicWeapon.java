package eugene.structural.bridge;

/**
 * Created by Jian on 2015/7/29.
 */
/**
 *
 * Abstraction interface.
 *
 */
abstract public class MagicWeapon {
    protected MagicWeaponImp magicWeaponImp;

    public MagicWeapon(MagicWeaponImp magicWeaponImp){
        this.magicWeaponImp = magicWeaponImp;
    }

    protected MagicWeapon() {
    }

    abstract public void wield();
    abstract public void swing();
    abstract public void unwield();

    public MagicWeaponImp  getImp(){
        return magicWeaponImp;
    }
}
