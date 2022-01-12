
package decoratordesignpattern;

public class Binocular extends WeaponAccessory{
    
    public Binocular(Weapon weapon) {
        super(weapon);
    }
    
    @Override
    public int aim_and_fire() {
        System.out.println("Binocular is added");
        /*
        Adding Binocular increase 7 damage point
         */
        return 7+super.aim_and_fire();
    }
    
}
