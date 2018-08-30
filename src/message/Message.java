package message;

public abstract class Message {
	private String data;
	
	public Message() 
	{
		super();
	}

	public Message(String data) 
	{
		super();
		this.data = data;
	}

	public String getData() {
		return data;
	}

	@Override
	public String toString() {
		return "Message []";
	}

	public void setData(String data) {
		this.data = data;
	}
	
}
