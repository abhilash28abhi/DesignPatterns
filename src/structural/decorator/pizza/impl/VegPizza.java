package structural.decorator.pizza.impl;

import structural.decorator.pizza.Pizza;

public class VegPizza implements Pizza {

    @Override
    public String getDesc() {
        return "SimplyVegPizza (230)";
    }

    @Override
    public double getPrice() {
        return 230;
    }
}
