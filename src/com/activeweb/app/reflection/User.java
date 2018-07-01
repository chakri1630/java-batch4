package com.activeweb.app.reflection;

import java.lang.reflect.InvocationTargetException;

public class User {

	public static void main(String args[])
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Media media = new Media();
		ReflectionTest.reflectObject(media);
	}

}
