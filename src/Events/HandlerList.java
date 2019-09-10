package Events;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class HandlerList {

	public static List<Listener> Handlers = new ArrayList<Listener>();

	public static Event callEvent(Event e) {
		Method[] methods;
		for (Object o : Handlers) {
			methods = o.getClass().getMethods();
			for (Method m : methods) {
				if (m.getAnnotation(EventHandler.class) != null) {
					try {
						if (m.getParameterTypes()[0].isAssignableFrom(e.getClass())) {
							m.invoke(o, e);
						}
					} catch (IllegalAccessException | InvocationTargetException ex) {
						ex.printStackTrace();
					}
				}
			}
		}
		return e;
	}

	public static void registerEvent(Listener o) {
		Handlers.add(o);
	}

	public static void ungisterEvent(Listener o) {
		Handlers.remove(o);
	}
}