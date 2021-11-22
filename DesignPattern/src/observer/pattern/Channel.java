package observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	List<Subscriber> sub=new ArrayList<Subscriber>();

	public void subscribe( Subscriber subs)
	{
		sub.add(subs);
	}

	public void unsubscribe( Subscriber subs)
	{
		sub.remove(subs);
	}

	public void notifysub()
	{
		for(Subscriber subs:sub)
		{
			subs.Updates();
		}
	}

	public void Upload()
	{
		System.out.println("Video Uploaded");
		notifysub();
	}
}
