import Service.EmailService;
import Service.MessageService;
import Service.SMSService;

public class TestMain {
    public static void main(String[] args)
    {
        MessageServiceInjector myDIInjector = null;
        Consumer consumer = null;

        myDIInjector = new EmailServiceInjector();
        consumer = myDIInjector.getConsumer();
        consumer.processMessages("Hello Welcome", "manibharath159@gmail.com");

        myDIInjector = new SMSServiceInjector();
        consumer = myDIInjector.getConsumer();
        consumer.processMessages("Hello Manibharathi", "9944033729");

        //MyDIInjector myDIInjector = new MyDIInjector(new EmailService()).processMessages("Hellow Welcome", "manibharath159@gmail.com");

        // ClientMessagingService clientMessagingService = new ClientMessagingService();
        // clientMessagingService.send("Hellow Welcome", "manibharath159@gmail.com");
    }
}
