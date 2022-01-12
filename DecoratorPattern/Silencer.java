package decoratordesignpattern;

public class Silencer extends WeaponAccessory {

    public Silencer(Weapon weapon) {
        super(weapon);
    }

    @Override
    public int aim_and_fire() {
        System.out.println("Silencer is added");
        /*
        Adding silencer increase 5 damage point
         */
        return 5 + super.aim_and_fire();
    }

}
