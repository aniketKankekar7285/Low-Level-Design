package SOLID.OCP.Better;

public class WebhookNotification implements Notification {


    @Override
    public void sendMessage(String message) {
        System.out.println("sending message through webhook");
    }
}
