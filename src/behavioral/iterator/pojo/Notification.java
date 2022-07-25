package behavioral.iterator.pojo;

public class Notification {

    String message;

    @Override public String toString() {
        return "Notification{" + "message='" + message + '\'' + '}';
    }

    public Notification (String message) {
        this.message = message;
    }
}
