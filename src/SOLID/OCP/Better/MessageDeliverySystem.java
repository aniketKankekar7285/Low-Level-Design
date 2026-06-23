package SOLID.OCP.Better;

public class MessageDeliverySystem {

    public void sendNotification(Notification notification, String message){
        notification.sendMessage(message);
    }
}
