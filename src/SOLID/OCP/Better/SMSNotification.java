package SOLID.OCP.Better;

public class SMSNotification implements Notification{


    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message through SMS ");
    }
}
