package behavior.strategy.domain;

import behavior.strategy.algorithm.WeaponBehavior;

public class King extends Character{

    public King(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        this.weapon.useWeapon();
    }
}
