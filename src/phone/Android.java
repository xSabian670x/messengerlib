package phone;

import protocols.MessageProtocol;
import message.Message;
import Storage.Google;


public class Android extends Phone implements MessageProtocol 
{
	public Android()
	{
		super(new Google());
	}
	
	public boolean send(Message message)
	{
		System.out.println("Sending "+message.toString());
		return storage.save(message);
	}
	
	public boolean recieve(Message message)
	{
		System.out.println("Recieving "+message.toString());
		return storage.save(message);
	}
}
