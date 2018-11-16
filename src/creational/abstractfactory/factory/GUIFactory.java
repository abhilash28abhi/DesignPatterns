package creational.abstractfactory.factory;

import creational.abstractfactory.button.Button;
import creational.abstractfactory.checkbox.Checkbox;

public interface GUIFactory {

    public abstract Button createButton();
    public abstract Checkbox createCheckbox();
}
