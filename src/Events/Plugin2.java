package Events;

public class Plugin2 {

	Plugin2() {
		HandlerList.registerEvent(this);
	}

	@EventHandler
	public void on(MyEvent e) {
		System.out.println("plugin 2 "+e.getS());
	}
}