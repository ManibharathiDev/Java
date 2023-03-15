import Service.MessageService;

public class MyDIInjector implements Consumer {

    private MessageService messageService;

    public MyDIInjector(MessageService messageService)
    {
        this.messageService = messageService;
    }

    @Override
    public void processMessages(String message, String address) {
        
        this.messageService.sendMessage(message, address);
        
    }
    
}
