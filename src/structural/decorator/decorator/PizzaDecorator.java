package structural.decorator.decorator;

import structural.decorator.pizza.Pizza;

public abstract class PizzaDecorator implements Pizza {

    @Override
    public String getDesc() {
        return "Toppings";
    }
}
