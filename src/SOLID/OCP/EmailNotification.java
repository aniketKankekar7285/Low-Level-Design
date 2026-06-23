package SOLID.OCP;

public class EmailNotification {
    String message;

    public void sendMessage(){
        System.out.println("Sending email: "+message);
    }
}
