package discoverone;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Task0_SingletonExample {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		MySingletonClass s1=MySingletonClass.getSingletonInstance();
		
		Constructor<MySingletonClass> constructor =
				MySingletonClass.class.getDeclaredConstructor();

        constructor.setAccessible(true);

        MySingletonClass s2 = constructor.newInstance();

        System.out.println(s1 == s2);

	}

}
