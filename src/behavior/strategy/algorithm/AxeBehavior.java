package behavior.strategy.algorithm;

public class AxeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Use Axe");
    }
}
