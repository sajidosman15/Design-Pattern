package decoratordesignpattern;

public class BaseWeapon implements Weapon {

    public BaseWeapon() {

    }

    @Override
    public int aim_and_fire() {
        /*
        Damage per second
         */
        return 10;
    }

}
