public class TwitterService implements MessageService{

    @Override
    public boolean sendMessage(String address, String message) {
       // String regex = "^[a-zA-z0-9+_.-]=@[a-zA-Z0-9.-]+$";
        boolean messageStatus = false;
        if(address.contains("@") && message.length()<=50)
        {
            messageStatus = true;
            System.out.println("The tweet is: "+message+" Send To "+address);
        }

        return messageStatus;
    }
    
}
