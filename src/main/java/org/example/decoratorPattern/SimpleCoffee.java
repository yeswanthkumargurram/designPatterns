package org.example.decoratorPattern;

public class SimpleCoffee implements Coffee{
    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public String description() {
        return "Simple Coffee";
    }
}
