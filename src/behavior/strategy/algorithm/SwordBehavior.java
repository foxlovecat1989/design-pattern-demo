package behavior.strategy.algorithm;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Use Sword");
    }
}
