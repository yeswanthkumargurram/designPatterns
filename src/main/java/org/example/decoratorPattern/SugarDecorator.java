package org.example.decoratorPattern;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.2; // Sugar costs 0.2
    }

    @Override
    public String description() {
        return super.description() + ", with Sugar";
    }
}
