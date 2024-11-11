package patterns.creation.factory.notificationservice;

public class FactoryMain {

    public static void main(String args[]){

        NotificationFactory factory;

        factory = new EmailNotificationFactory();
        Notification emailNotification =    factory.createNotification();
        emailNotification.notifyUser();

        factory = new SmsNotificationFactory();
        Notification smsNotification =    factory.createNotification();
        smsNotification.notifyUser();
    }

}
