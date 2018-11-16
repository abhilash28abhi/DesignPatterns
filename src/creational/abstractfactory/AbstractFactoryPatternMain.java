package creational.abstractfactory;

import creational.abstractfactory.factory.GUIFactory;
import creational.abstractfactory.factory.impl.MacOSFactory;
import creational.abstractfactory.factory.impl.WindowsOSFactory;

public class AbstractFactoryPatternMain {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = "mac";
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsOSFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.drawDiagram();
    }
}
