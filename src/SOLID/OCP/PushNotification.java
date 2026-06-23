package SOLID.OCP;

public class PushNotification {
    String message;

    public void sendMessage(){
        System.out.println("Sending push notification"+message);
    }
}
