package org.example.flyweightPattern;

public class FlyweightPatternExample {
    public static void main(String[] args) {
        CoffeeFlavorFactory flavorFactory = new CoffeeFlavorFactory();
        // Order some coffee flavors
        CoffeeOrder order1 = flavorFactory.getCoffeeFlavor("Cappuccino");
        order1.serveCoffee(new CoffeeContext(1));
        CoffeeOrder order2 = flavorFactory.getCoffeeFlavor("Espresso");
        order2.serveCoffee(new CoffeeContext(2));
        CoffeeOrder order3 = flavorFactory.getCoffeeFlavor("Cappuccino");
        order3.serveCoffee(new CoffeeContext(3));
        // Display the total number of flavors created (should be 2, not 3) System.out.println("Total Coffee Flavors created: " + flavorFactory.getTotalFlavors());
    }
}
/*In this example:
- CoffeeFlavor is the concrete flyweight class representing the coffee flavor.
- CoffeeFlavorFactory is the flyweight factory that manages and creates instances of CoffeeFlavor.
- CoffeeContext is the context object containing the unique state (table number in this case).
- The main method demonstrates how the flyweights are used to serve coffee flavors to different tables.
The key idea is that the flyweight (CoffeeFlavor) is shared among different contexts (tables), and only the unique information (table number) is stored separately. This can significantly reduce memory usage when there are many instances with similar shared characteristics.*/