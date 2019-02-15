package by.itacademy.java.dserbunou.classroom.lesson2;

public class Test {
	private static class Car {
		private int year;

		public Car(int year) {
			this.year = year;
		}
		public int getYear() {
			return year;
		}
	}
	public static void main(final String[] args) {
		Car car = new Car(2010);
		Car similarCar = new Car(2010);
		System.out.println(car == similarCar);
	}
    public char[] nonStaticField;

}
