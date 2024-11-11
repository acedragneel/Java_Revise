package patterns.creation.factory.notificationservice;

public class SmsNotificationFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
