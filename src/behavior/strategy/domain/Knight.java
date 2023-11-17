package behavior.strategy.domain;

import behavior.strategy.algorithm.WeaponBehavior;

public class Knight extends Character{

    public Knight(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        this.weapon.useWeapon();
    }
}
