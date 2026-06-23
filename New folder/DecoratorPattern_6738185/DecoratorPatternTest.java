public class DecoratorPatternTest {

    public static void main(String[] args) {

        System.out.println("Email Notification:");
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send();

        System.out.println("\nEmail + SMS Notification:");
        Notifier smsNotifier =
                new SMSNotifierDecorator(new EmailNotifier());
        smsNotifier.send();

        System.out.println("\nEmail + SMS + Slack Notification:");
        Notifier allNotifier =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()));

        allNotifier.send();
    }
}