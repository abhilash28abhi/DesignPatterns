package structural.decorator.pizza.impl;

import structural.decorator.pizza.Pizza;

public class NonVegPizza implements Pizza {

    @Override
    public String getDesc() {
        return "SimplyNonVegPizza (350)";
    }

    @Override
    public double getPrice() {
        return 350;
    }
}
