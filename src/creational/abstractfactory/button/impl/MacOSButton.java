package creational.abstractfactory.button.impl;

import creational.abstractfactory.button.Button;

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
