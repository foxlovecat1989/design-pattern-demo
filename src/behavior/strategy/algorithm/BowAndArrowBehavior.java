package behavior.strategy.algorithm;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Use Bow And Arrow");
    }
}
