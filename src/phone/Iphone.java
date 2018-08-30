package phone;
import Storage.Icloud;
import protocols.MessageProtocol;
import message.Message;

public final class Iphone extends Phone implements MessageProtocol 
{
	public Iphone()
	{
		super(new Icloud());
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
