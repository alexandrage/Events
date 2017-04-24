package Events;

public class Plugin2 extends Main {

	Plugin2() {
		RegisterEvent.add(this);
	}

	@EventHandler
	public void on(MyEvent e) {
		System.out.println("plugin 2 "+e.getS());
	}
}