package Service;

public class EmailService implements MessageService {

    @Override
    public void sendMessage(String message, String address) {
        System.out.println("Email Sent successfully with Message "+message);
    }
    
    
}
