package by.itacademy.java.dserbunou.classroom.lesson7.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Result {

	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		runAutoexecutable(new Test());
		runAutoexecutable(new Test2());
		runAutoexecutable(new Test3());
		runAutoexecutable(new Object());
		runAutoexecutable(new String());
	}

	private static void runAutoexecutable(final Object o)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		final Class<? extends Object> clazz = o.getClass();
		System.out.printf("processing object of class %s\n", clazz);

		final Method[] methods = clazz.getDeclaredMethods();

		for (final Method method : methods) {
			final Autoexecutable annotation = method.getAnnotation(Autoexecutable.class);
			if (annotation != null) {
				method.invoke(o);
			}
		}
		System.out.println("---------------------");
	}
}
