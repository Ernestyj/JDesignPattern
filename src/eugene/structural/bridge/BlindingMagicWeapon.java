package eugene.structural.bridge;

/**
 * Created by Jian on 2015/7/29.
 */
public class BlindingMagicWeapon extends MagicWeapon {
    public BlindingMagicWeapon(BlindingMagicWeaponImp blindingMagicWeaponImp){
        super(blindingMagicWeaponImp);
    }

    public BlindingMagicWeaponImp getImp(){
        return (BlindingMagicWeaponImp) magicWeaponImp;//继承
    }

    @Override
    public void wield() {
        getImp().wieldImp();
    }

    @Override
    public void swing() {
        getImp().swingImp();
    }

    @Override
    public void unwield() {
        getImp().unwieldImp();
    }

    public void blind(){
        getImp().blindImp();
    }
}
