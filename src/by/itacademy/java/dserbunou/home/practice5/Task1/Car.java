package by.itacademy.java.dserbunou.home.practice5.Task1;

public class Car {

	private int year;
	private String model;

	// private List<Car> cars;

	/*
	 * public Car(List<Car> cars) { super(); Collections.sort(model); this.cars =
	 * cars; }
	 */

	public Car(int year, String model) {
		super();
		this.year = year;
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		return String.format("{model=%s, year=%d}", model, year);
	}

}
