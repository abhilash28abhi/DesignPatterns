package behavioral.iterator;

import behavioral.iterator.pojo.Notification;

public class NotificationIterator implements Iterator {

    private Notification[] notificationList;
    int currentIndex = 0;

    public NotificationIterator (Notification[] notifications) {
        this.notificationList = notifications;
    }

    @Override public Object next() {
        Notification notification = notificationList[currentIndex];
        currentIndex++;
        return notification;
    }

    @Override public boolean hasNext() {
        if (currentIndex > notificationList.length || notificationList[currentIndex] == null) {
            return false;
        } else {
            return true;
        }
    }
}
