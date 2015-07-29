package eugene.structural.bridge;

/**
 * Created by Jian on 2015/7/29.
 */
public class SoulEatingMagicWeapon extends MagicWeapon {

    public SoulEatingMagicWeapon(SoulEatingMagicWeaponImp soulEatingMagicWeaponImp) {
        super(soulEatingMagicWeaponImp);
    }

    @Override
    public SoulEatingMagicWeaponImp getImp(){
        return (SoulEatingMagicWeaponImp) magicWeaponImp;//继承
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

    public void eatSoul(){
        getImp().eatSoulImp();
    }
}
