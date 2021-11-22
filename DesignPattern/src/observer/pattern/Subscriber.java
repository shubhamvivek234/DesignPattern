package observer.pattern;

public class Subscriber {
	
	private  String  name;
	private  Channel channel = new Channel();
	
	

	public Subscriber(String name) {
		super();
		this.name = name;
	}



	public void Updates() 
	{
		System.out.println("Watch the Newly Uploaded video");
		
	}

	
	


	
	
	

}
