package structural.proxy;

public class ProxyStudent implements Student {

    private RealStudent realStudent;

    @Override public String getName() {
        //acts as a proxy to the actual object provided both follow same interface
        //we can have several checks before calling the actual object
        return realStudent.getName();
    }
}
