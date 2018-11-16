package structural.decorator.decorator.impl;

import structural.decorator.decorator.PizzaDecorator;
import structural.decorator.pizza.Pizza;

public class Cheese extends PizzaDecorator {

    private final Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Cheese (20.72)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 20.72;
    }
}
