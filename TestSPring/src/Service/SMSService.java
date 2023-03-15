package Service;

public class SMSService implements MessageService {

    @Override
    public void sendMessage(String message, String address) {
        System.out.println("SMS Sent successfully with Message "+message);
    }
    
}
