
package factorypattern;

public class Pizza implements Food{

    @Override
    public void prepareFood() {
        System.out.println("Preparing Pizza");
    }
    
}
