package behavioral.iterator;

import behavioral.iterator.collection.NotificationCollection;

public class ClientNotificationClass {

    public static void main(String[] args) {
        NotificationCollection notificationCollection = new NotificationCollection();
        notificationCollection.addElement("Notification 1");
        notificationCollection.addElement("Notification 2");
        notificationCollection.addElement("Notification 3");

        //create an iterator
        Iterator notificationItr = notificationCollection.createIterator();
        while (notificationItr.hasNext()) {
            System.out.println(notificationItr.next());
        }
    }
}
