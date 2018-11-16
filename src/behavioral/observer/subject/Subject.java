package behavioral.observer.subject;


import behavioral.observer.observer.Observer;

public interface Subject {
    public void subscribeObserver(Observer observer);
    public void unSubscribeObserver(Observer observer);
    public void notifyObservers();
    public String subjectDetails();
}
