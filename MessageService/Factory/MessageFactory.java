/**
 * Factory Pattern Design
 */
public class MessageFactory {
    private static MessageService messageService;

    public static MessageService getInstance()
    {
        messageService = new EmailService();
        return messageService;
    }
}
