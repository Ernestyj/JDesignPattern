package eugene.structural.bridge;

/**
 * Created by Jian on 2015/7/29.
 */
public class StormBringer extends SoulEatingMagicWeaponImp{

    @Override
    public void eatSoulImp() {
        System.out.println("Stormbringer devours the enemy's soul");
    }

    @Override
    public void wieldImp() {
        System.out.println("wielding Stormbringer");
    }

    @Override
    public void swingImp() {
        System.out.println("swinging Stormbringer");
    }

    @Override
    public void unwieldImp() {
        System.out.println("unwielding Stormbringer");
    }
}
