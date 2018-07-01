package com.activeweb.app.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {

	public static void reflectObject(Object obj)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class c = obj.getClass();

		System.out.println("Name is ..." + c.getName());

		System.out.println("Super class is ..." + c.getSuperclass());

		Method[] methods = c.getMethods();

		for (Method m : methods) {
			//System.out.println("method.." + m.getName());
			if (m.getName().equals("getMediaType")) {
				System.out.println(""+m.invoke(new Media(), null));
			}
		}

		Field[] fields = c.getFields();

		System.out.println("Methods in the class are ..." + methods);

		System.out.println("Fields in the class are ..." + fields);

	}

}
