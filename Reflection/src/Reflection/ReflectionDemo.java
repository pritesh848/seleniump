package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionDemo {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c = TestClass.class;
		Method[] allmethod = c.getDeclaredMethods();
		System.out.println("enter method name to execute");
		Scanner sc = new Scanner(System.in);
		String m = sc.next();
		for (Method method : allmethod) {
			if (m.equals(method.getName())) {
				method.invoke(new TestClass());
			}
		}
		

	}

}
