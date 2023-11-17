package behavior.strategy.domain;

import behavior.strategy.algorithm.WeaponBehavior;

public class Queen extends Character{

    public Queen(WeaponBehavior weapon) { super(weapon); }

    @Override
    public void attack() { this.weapon.useWeapon(); }
}
