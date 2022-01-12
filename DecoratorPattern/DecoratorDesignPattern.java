package decoratordesignpattern;

public class DecoratorDesignPattern {

    public static void main(String[] args) {
        Weapon baseWeapon = new BaseWeapon();
        System.out.println("Damage per second is: "+baseWeapon.aim_and_fire());
        
        Weapon silencer=new Silencer(baseWeapon);
        System.out.println("Damage per second is: "+silencer.aim_and_fire());
        
        Weapon binocular=new Binocular(silencer);
        System.out.println("Damage per second is: "+binocular.aim_and_fire());
        
        Weapon handGuards=new HandGuards(binocular);
        System.out.println("Damage per second is: "+handGuards.aim_and_fire());
        
    }

}
