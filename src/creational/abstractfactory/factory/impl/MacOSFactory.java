package creational.abstractfactory.factory.impl;

import creational.abstractfactory.button.Button;
import creational.abstractfactory.button.impl.MacOSButton;
import creational.abstractfactory.checkbox.Checkbox;
import creational.abstractfactory.checkbox.impl.MacOSCheckbox;
import creational.abstractfactory.factory.GUIFactory;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
