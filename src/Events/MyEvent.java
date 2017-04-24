package Events;

public class MyEvent implements Event, Cancellable {
	String s;
	boolean cancel;

	MyEvent(String s) {
		this.s = s;
		this.cancel = false;
	}

	String getS() {
		return s;
	}

	@Override
	public boolean isCancelled() {
		return this.cancel;
	}

	@Override
	public void setCancelled(boolean cancel) {
		this.cancel = cancel;
	}
}