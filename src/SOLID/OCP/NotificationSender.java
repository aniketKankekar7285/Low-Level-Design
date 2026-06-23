package SOLID.OCP;

public class NotificationSender {
    EmailNotification emailNotification;
    PushNotification pushNotification;
    SMSNotification smsNotification;

    public NotificationSender(PushNotification pushNotification, EmailNotification emailNotification, SMSNotification smsNotification) {
        this.pushNotification = pushNotification;
        this.emailNotification = emailNotification;
        this.smsNotification = smsNotification;
    }

    public void sendMessage(String message, String deliveryType){
        switch (deliveryType){
            case "EMAIL":
                emailNotification.sendMessage();
                break;

            case "PUSH":
                pushNotification.sendMessage();
                break;

            case "SMS":
                smsNotification.sendNotification();
                break;
            default:
                System.out.println("invalid delivery method");

        }
    }
}
