package creational.singleton;

public class SingletonPatternMain {

    // private instance, so that it can be accessed by only by getInstance() method
    private static SingletonPatternMain instance;

    private SingletonPatternMain() {
        // private constructor 
    }

    public static SingletonPatternMain getInstance() {
        if (instance == null) {
            //synchronized block to remove overhead 
            synchronized (SingletonPatternMain.class) {
                if (instance == null) {
                    // if instance is null, initialize 
                    instance = new SingletonPatternMain();
                }

            }
        }
        return instance;
    }
}
