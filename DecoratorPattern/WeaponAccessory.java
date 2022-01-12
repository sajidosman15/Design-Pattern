package decoratordesignpattern;

public class WeaponAccessory implements Weapon {

    private Weapon weapon;

    public WeaponAccessory(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public int aim_and_fire() {
        return weapon.aim_and_fire();
    }

}
