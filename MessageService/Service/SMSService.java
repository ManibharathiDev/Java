public class SMSService implements MessageService {

    @Override
    public boolean sendMessage(String address, String message) {
        String regex = "\\d{10}";
        boolean messageStatus = false;
        if(address.matches(regex))
        {
            messageStatus = true;
            System.out.println("The message is: "+message+" Send To "+address);
        }

        return messageStatus;


    }
    
}
