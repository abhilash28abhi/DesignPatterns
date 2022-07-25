package behavioral.iterator.collection;

import behavioral.iterator.Iterator;
import behavioral.iterator.NotificationIterator;
import behavioral.iterator.pojo.Notification;

public class NotificationCollection implements Collection {

    Notification[] notificationsArray;
    int collectionSize = 10;
    int numberOfElements = 0;

    public NotificationCollection () {
        this.notificationsArray = new Notification[collectionSize];
    }

    public void addElement (String message) {
        if (numberOfElements > collectionSize) {
            System.out.println("Collection is full");
        } else {
            Notification notification = new Notification(message);
            notificationsArray[numberOfElements] = notification;
            numberOfElements++;
        }
    }

    @Override public Iterator createIterator() {
        return new NotificationIterator(notificationsArray);
    }
}
