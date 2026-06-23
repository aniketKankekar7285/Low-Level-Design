package SOLID.OCP.Better;

public class PushNotification implements Notification {
    @Override
    public void sendMessage(String message) {
        System.out.println("sending message through push notification");
    }
}
