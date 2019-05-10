package by.itacademy.java.dserbunou.classroom.lesson2;

public class Object {
	private static class Car {
		int year;
	}

	public static void main(final String[] args) {
		final Car c1 = new Car();
		c1.year = 2018;
		final Car c2 = c1;
		System.out.println("c1.year=" + c1.year);
		System.out.println("c2.year=" + c2.year);
		System.out.println("change c1...");
		c1.year = 2017;
		System.out.println("c1.year=" + c1.year);
		System.out.println("c2.year=" + c2.year);
	}

}
