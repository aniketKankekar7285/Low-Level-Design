package SOLID.OCP.Better;

public class EmailNotification implements Notification{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message through Email:"+ message);
    }
}
