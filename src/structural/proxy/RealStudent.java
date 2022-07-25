package structural.proxy;

public class RealStudent implements Student {

    @Override public String getName() {
        return "Real student present";
    }
}
