import Service.MessageService;
import Service.SMSService;

public class ClientMessagingService {
    
    MessageService messageService = new SMSService();

    public void send(String message, String address)
    {
        messageService.sendMessage(message, address);
    }
}
