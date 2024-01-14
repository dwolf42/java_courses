package dwolf.dependency_injection;

public class EmailServiceImpl implements MessageService{

    @Override
    public void sendMessage(String msg, String rec) {
        // logic to send mail
        System.out.println("Email sent to " + rec + " with Message= " + msg);
    }
}
