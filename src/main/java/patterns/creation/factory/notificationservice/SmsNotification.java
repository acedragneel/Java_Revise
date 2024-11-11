package patterns.creation.factory.notificationservice;

public class SmsNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending an Sms Notification");
    }
}
