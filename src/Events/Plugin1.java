package Events;

public class Plugin1 extends Main {

	Plugin1() {
		RegisterEvent.add(this);
	}

	@EventHandler
	public void on(MyEvent e) {
		System.out.println("plugin 1 "+e.getS());
	}
	
	@EventHandler
	public void on(MyEvent2 e) {
		System.out.println("plugin 1 "+e.getList());
		e.setCancelled(true);
	}
}