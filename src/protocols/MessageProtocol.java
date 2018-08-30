package protocols;
import message.Message;



public interface MessageProtocol 
{
	public boolean send(Message message);
	public boolean recieve(Message message);
	
	
	
	
	
}
