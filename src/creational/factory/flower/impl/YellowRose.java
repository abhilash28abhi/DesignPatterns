package creational.factory.flower.impl;

import creational.factory.flower.Rose;

public class YellowRose implements Rose {

    @Override
    public void addColor() {
        System.out.println("Hello – I am the Yellow Rose !");
    }
}
