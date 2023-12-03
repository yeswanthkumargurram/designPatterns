package org.example.decoratorPattern;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.5; // Milk costs 0.5
    }

    @Override
    public String description() {
        return super.description() + ", with Milk";
    }
}
