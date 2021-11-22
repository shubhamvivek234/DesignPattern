package observer.pattern;

public class pubSubPattern {
	public static void main(String[] args)
	{
		Channel yesTheory =new Channel();
		
		Subscriber s1=new Subscriber("Shubham");
		Subscriber s2=new Subscriber("Shivangi");
		Subscriber s3=new Subscriber("kriti");
		Subscriber s4=new Subscriber("bholu");
		Subscriber s5=new Subscriber("riya");
		
		
		yesTheory.subscribe(s1);
		yesTheory.subscribe(s2);
		yesTheory.subscribe(s3);
		yesTheory.subscribe(s4);
		yesTheory.subscribe(s5);
		
		
		yesTheory.Upload();
		
		
		
	}
}
