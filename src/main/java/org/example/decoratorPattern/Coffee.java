package org.example.decoratorPattern;

public interface Coffee {
    double cost();
    String description();

    /*In this example:
            - Coffee is the component interface representing the basic object (a simple coffee).
            - SimpleCoffee is the concrete component implementing the Coffee interface.
            - CoffeeDecorator is the abstract decorator class containing a reference to a Coffee object.
            - MilkDecorator and SugarDecorator are concrete decorators adding specific condiments to the coffee.

    The main method demonstrates creating different combinations of coffee with decorators. The Decorator Pattern allows you to add new functionality to objects dynamically and in a flexible way.*/
}
