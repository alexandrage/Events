package Events;

import java.util.Arrays;

public class Main {
	
	//Tested events.
	public static void main(String[] args)	 {
		new Plugin1();
		new Plugin2();
		MyEvent e = new MyEvent("test");
		MyEvent2 e2 = new MyEvent2(Arrays.asList(new String[]{"list1","list2"}));
		MyEvent ev1 = RegisterEvent.callEvent(e);
		MyEvent2 ev2 = RegisterEvent.callEvent(e2);
		if(ev1.isCancelled()) {
			System.out.println("MyEvent isCancelled");
		}
		if(ev2.isCancelled()) {
			System.out.println("MyEvent2 isCancelled");
		}
	}
}