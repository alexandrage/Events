package Events;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class RegisterEvent {

	public static List<Object> eventContainers = new ArrayList<Object>();

	public static <T> T callEvent(T e) {
	    Method[] methods;
	    for (Object o : eventContainers) {
	        methods = o.getClass().getMethods();
	        for (Method m : methods) {
	            if (m.getAnnotation(EventHandler.class) != null) {
	                try {
	                    if (m.getParameterTypes()[0].isAssignableFrom(e.getClass())) {
	                        m.invoke(o, e);
	                    }
	                } catch (IllegalAccessException ex) {
	                	ex.printStackTrace();
	                } catch (IllegalArgumentException ex) {
	                	ex.printStackTrace();
	                } catch (InvocationTargetException ex) {
	                	ex.printStackTrace();
	                }
	            }
	        }
	    }
		return (T) e;
	}

	public static void add(Object o) {
		eventContainers.add(o);
	}
}