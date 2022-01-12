package factorypattern;

public class FactoryPattern {

    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();

        Food vegitable = foodFactory.getFood("Vegitable");
        vegitable.prepareFood();

        Food pizza = foodFactory.getFood("pizza");
        pizza.prepareFood();

        Food burger = foodFactory.getFood("burger");
        burger.prepareFood();

    }

}
