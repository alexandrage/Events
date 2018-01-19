package Events;

public class Plugin1 extends Plugin implements Listener {

	public void onEnable() {
		HandlerList.registerEvent(this);
	}

	@EventHandler
	public void on(MyEvent e) {
		System.out.println("plugin 1 " + e.getS());
	}

	@EventHandler
	public void on(MyEvent2 e) {
		System.out.println("plugin 1 " + e.getList());
		e.setCancelled(true);
	}
}