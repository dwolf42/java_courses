package dwolf.dependency_injection;

public class MyMessageDITest {

    public static void main(String[] args) {
        String msg = "Hi Vindar";
        String email = "vingar@vingar.com";
        String phone = "+1299999999";
        MessageServiceInjector injector;
        Consumer app;

        // Send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);

        // Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);
    }
}
