package creational.abstractfactory.button.impl;

import creational.abstractfactory.button.Button;

public class WindowsOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsOSButton.");
    }
}
