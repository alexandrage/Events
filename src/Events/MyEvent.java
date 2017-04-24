package Events;

public class MyEvent implements Event {
	String s;

	MyEvent(String s) {
		this.s = s;
	}

	String getS() {
		return s;
	}
}