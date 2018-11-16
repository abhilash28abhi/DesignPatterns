package creational.abstractfactory;

import creational.abstractfactory.button.Button;
import creational.abstractfactory.checkbox.Checkbox;
import creational.abstractfactory.factory.GUIFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void drawDiagram() {
        button.paint();
        checkbox.draw();
    }
}
