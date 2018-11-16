package behavioral.observer;

import behavioral.observer.domain.Commentary;
import behavioral.observer.domain.CommentaryObject;
import behavioral.observer.observer.Observer;
import behavioral.observer.observer.SMSUsers;
import behavioral.observer.subject.Subject;

import java.util.ArrayList;

public class ObserverPatternMain {

    public static void main(String[] args) {
        Subject subject = new CommentaryObject(new ArrayList<Observer>(), "Soccer Match[2018AUG24]");
        Observer observer1 = new SMSUsers(subject, "Adam Warner [New York]");
        observer1.subscribe();
        System.out.println();
        Observer observer2 = new SMSUsers(subject, "Tim Ronney [London]");
        observer2.subscribe();
        Commentary cObject = ((Commentary) subject);
        cObject.setDesc("Welcome to live Soccer match");
        cObject.setDesc("Current score 0-0");
        System.out.println();
        observer2.unSubscribe();
        System.out.println();
        cObject.setDesc("It’s a goal!!");
        cObject.setDesc("Current score 1-0");
        System.out.println();
        Observer observer3 = new SMSUsers(subject, "Marrie [Paris]");
        observer3.subscribe();
        System.out.println();
        cObject.setDesc("It’s another goal!!");
        cObject.setDesc("Half-time score 2-0");
    }
}
