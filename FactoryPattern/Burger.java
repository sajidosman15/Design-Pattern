
package factorypattern;

public class Burger implements Food{

    @Override
    public void prepareFood() {
        System.out.println("Preparing Burger");
    }
    
}
