package behavioral.observer.observer;

public interface Observer {
    //update() will be called by the subject notify()
    public void update(String desc);
    public void subscribe();
    public void unSubscribe();
}
