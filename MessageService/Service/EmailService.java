public class EmailService implements MessageService{

    @Override
    public boolean sendMessage(String address, String message) {
        String regex = "^[a-zA-z0-9+_.-]=@[a-zA-Z0-9.-]+$";
        boolean messageStatus = false;
        if(address.matches(regex))
        {
            messageStatus = true;
            System.out.println("The message is: "+message+" Send To "+address);
        }

        return messageStatus;
    }
    
}
