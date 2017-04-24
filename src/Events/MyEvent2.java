package Events;

import java.util.List;

public class MyEvent2 implements Event {

	List<String> l;

	MyEvent2(List<String> l) {
		this.l = l;
	}

	List<String> getList() {
		return l;
	}
}
