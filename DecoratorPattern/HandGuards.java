package decoratordesignpattern;

public class HandGuards extends WeaponAccessory {

    public HandGuards(Weapon weapon) {
        super(weapon);
    }

    @Override
    public int aim_and_fire() {
        System.out.println("Hand Guards is added");
        /*
        Adding HandGuards increase 9 damage point
         */
        return 9 + super.aim_and_fire();
    }

}
