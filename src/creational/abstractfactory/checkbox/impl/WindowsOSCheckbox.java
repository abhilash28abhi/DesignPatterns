package creational.abstractfactory.checkbox.impl;

import creational.abstractfactory.checkbox.Checkbox;

public class WindowsOSCheckbox implements Checkbox {

    @Override
    public void draw() {
        System.out.println("You have created WindowsOSCheckbox.");
    }
}
