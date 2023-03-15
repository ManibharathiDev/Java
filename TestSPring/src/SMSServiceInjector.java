import Service.SMSService;

public class SMSServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        // TODO Auto-generated method stub
        return new MyDIInjector(new SMSService());
    }
    
}
