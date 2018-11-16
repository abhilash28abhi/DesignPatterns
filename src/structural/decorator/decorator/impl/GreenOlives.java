package structural.decorator.decorator.impl;

import structural.decorator.decorator.PizzaDecorator;
import structural.decorator.pizza.Pizza;

public class GreenOlives extends PizzaDecorator {

    private final Pizza pizza;

    public GreenOlives(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Green Olives (5.47)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 5.47;
    }
}
