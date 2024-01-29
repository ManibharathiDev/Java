package main.java.com.example.springcontext.services;
public class SMSService implements MessageService {

    @Override
    public boolean sendMessage(String msg, String rec) {
        System.out.println("SMS message Sent to "+rec+ " with Message="+msg);
		return true;
    }
    
}
