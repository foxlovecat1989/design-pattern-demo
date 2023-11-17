package behavior.strategy.domain;

import behavior.strategy.algorithm.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weapon;

    public Character(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public abstract void attack();
}
