package eugene.structural.bridge;

/**
 * Created by Jian on 2015/7/29.
 */
public class FlyingMagicWeapon extends MagicWeapon {
    public FlyingMagicWeapon(FlyingMagicWeaponImp flyingMagicWeaponImp){
        super(flyingMagicWeaponImp);
    }

    public FlyingMagicWeaponImp getImp(){
        return (FlyingMagicWeaponImp) magicWeaponImp;//继承
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

    public void fly(){
        getImp().flyImp();
    }
}
