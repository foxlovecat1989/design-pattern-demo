package behavior.strategy.domain;

import behavior.strategy.algorithm.WeaponBehavior;

public class Troll extends Character{

    public Troll(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        this.weapon.useWeapon();
    }
}
