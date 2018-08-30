package phone;

import java.util.List;

import Storage.StorageProvider;
import message.Message;
import message.TextMessage;




public abstract class Phone 
{
	protected StorageProvider storage;
	
	public Phone(StorageProvider storageProvider)
	{
		storage = storageProvider;
	}
	
	public void viewAllMessage()
	{
		List<Message> messages = storage.retrieveAll();
		for(Message m: messages)
		{
			System.out.println(m);
			if(m instanceof TextMessage)
			{
				System.out.println("This is a text message");
			}
		}
			
	}
	
}
