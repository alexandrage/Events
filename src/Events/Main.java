package Events;

import java.util.Arrays;

public class Main {

	// Tested events.
	public static void main(String[] args) {
		new Plugin1().onEnable();
		new Plugin2().onEnable();
		MyEvent e = new MyEvent("test");
		MyEvent2 e2 = new MyEvent2(Arrays.asList(new String[] { "list1", "list2" }));
		HandlerList.callEvent(e);
		HandlerList.callEvent(e2);
		if (e.isCancelled()) {
			System.out.println("MyEvent isCancelled");
		}
		if (e2.isCancelled()) {
			System.out.println("MyEvent2 isCancelled");
		}
	}
}