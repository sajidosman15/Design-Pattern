package factorypattern;

public class FoodFactory {

    public Food getFood(String type) {
        if (type == null) {
            return null;
        } else if (type.equalsIgnoreCase("Vegitable")) {
            return new Vegitable();
        } else if (type.equalsIgnoreCase("Burger")) {
            return new Burger();
        } else if (type.equalsIgnoreCase("Pizza")) {
            return new Pizza();
        }
        return null;
    }
}
