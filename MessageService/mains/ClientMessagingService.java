public class ClientMessagingService {
    //Tight Coupling
    //private MessageService mService = new SMSService();

    //Lossely Coupling
    private MessageService mService = MessageFactory.getInstance();

    public void send(String address, String message)
    {
       boolean mStatus = mService.sendMessage(address, message);
       if(mStatus)
            System.out.println("Message Sent succssfully");
        else
            System.out.println("Unable to send, Plase check your address");    
    }
}
