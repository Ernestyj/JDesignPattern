package eugene.structural.bridge;

public class App {
    public App(){

    }
    public static void main(String[] args){
        BlindingMagicWeapon blindingMagicWeapon = new BlindingMagicWeapon(new Excalibur());
        blindingMagicWeapon.wield();
        blindingMagicWeapon.blind();
        blindingMagicWeapon.swing();
        blindingMagicWeapon.unwield();

        FlyingMagicWeapon flyingMagicWeapon = new FlyingMagicWeapon(new Mjollnir());
        flyingMagicWeapon.wield();
        flyingMagicWeapon.fly();
        flyingMagicWeapon.swing();
        flyingMagicWeapon.unwield();

        SoulEatingMagicWeapon soulEatingMagicWeapon = new SoulEatingMagicWeapon(new StormBringer());
        soulEatingMagicWeapon.wield();
        soulEatingMagicWeapon.eatSoul();
        soulEatingMagicWeapon.swing();
        soulEatingMagicWeapon.unwield();
    }
}
