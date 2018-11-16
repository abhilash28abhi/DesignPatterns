package creational.abstractfactory.factory.impl;

import creational.abstractfactory.button.Button;
import creational.abstractfactory.button.impl.WindowsOSButton;
import creational.abstractfactory.checkbox.Checkbox;
import creational.abstractfactory.checkbox.impl.WindowsOSCheckbox;
import creational.abstractfactory.factory.GUIFactory;

public class WindowsOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsOSCheckbox();
    }
}
