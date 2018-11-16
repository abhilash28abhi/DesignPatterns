package structural.decorator;

import structural.decorator.decorator.impl.Broccoli;
import structural.decorator.decorator.impl.Cheese;
import structural.decorator.decorator.impl.GreenOlives;
import structural.decorator.decorator.impl.Meat;
import structural.decorator.pizza.Pizza;
import structural.decorator.pizza.impl.NonVegPizza;
import structural.decorator.pizza.impl.VegPizza;

import java.text.DecimalFormat;

public class DecoratorPatternMain {

    public static void main(String[] args) {
        DecimalFormat dformat = new DecimalFormat("#.##");
        Pizza pizza = new VegPizza();
        pizza = new GreenOlives(pizza);
        pizza = new Broccoli(pizza);
        System.out.println("Desc: " + pizza.getDesc());
        System.out.println("Price: " + dformat.format(pizza.getPrice()));
        pizza = new NonVegPizza();
        pizza = new Meat(pizza);
        pizza = new Cheese(pizza);
        pizza = new Cheese(pizza);
        System.out.println("Desc: " + pizza.getDesc());
        System.out.println("Price: " + dformat.format(pizza.getPrice()));
    }
}
