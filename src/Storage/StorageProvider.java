package Storage;
import message.Message;
import java.util.List;
import java.util.ArrayList;

public abstract class StorageProvider 
{
	private List<Message> messages;
	
	public StorageProvider()
	{
		messages = new ArrayList<Message>();
	}
	
	public boolean save(Message message)
	{
		messages.add(message);
		return true;
	}
	
	public List<Message> retrieveAll()
	{
		
		return messages;
	}
}
