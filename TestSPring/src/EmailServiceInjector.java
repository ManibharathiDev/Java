import Service.EmailService;

public class EmailServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIInjector(new EmailService());
    }
    
}
