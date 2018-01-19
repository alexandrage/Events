package Events;

public class Plugin2 extends Plugin implements Listener {

	public void onEnable() {
		HandlerList.registerEvent(this);
	}

	@EventHandler
	public void on(MyEvent e) {
		System.out.println("plugin 2 " + e.getS());
	}
}