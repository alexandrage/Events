package Events;

import java.util.List;

public class MyEvent2 implements Event, Cancellable {

	List<String> l;
	boolean cancel;
	MyEvent2(List<String> l) {
		this.l = l;
		this.cancel = false;
	}

	List<String> getList() {
		return l;
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
