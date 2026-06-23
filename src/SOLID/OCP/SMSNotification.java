package SOLID.OCP;

public class SMSNotification {
    String message;

    public void sendNotification(){
        System.out.println("sending SMS notification"+message);
    }
}
