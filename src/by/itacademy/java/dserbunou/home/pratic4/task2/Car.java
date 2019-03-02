package by.itacademy.java.dserbunou.home.pratic4.task2;

public class Car {

	private String model;
	// private Engine engine;
	private Wheel wheel;

	public Car(String model) {
		this.model = model;
		// this.wheel.setTireType("winter");
	}

	public String getModel() {
		return model;
	}

	public void run() {
		System.out.println("Car run");
	}

	public void refuel() {
		System.out.println("Car refuel");
	}

	public void infoAuto() {
		System.out.println("Auto model:\n" + getModel());
	}

	public void changeWheel() {
		// System.out.printf("Set the wheel %s diameter %s tireType",
		// wheel.getDiameter(), wheel.getTireType());
	}

}
