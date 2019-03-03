package by.itacademy.java.dserbunou.home.pratic4.task2;

public class Car {

	private String model;

	private Wheel frontRight = new Wheel();
	private Wheel frontLeft = new Wheel();
	private Wheel rearRight = new Wheel();
	private Wheel rearLeft = new Wheel();

	Engine engine = new Engine(3.0, 8);
	Wheel wheel = new Wheel();

	public Car(String model) {
		super();
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void changeWheel(int diameter, String tireType) {
		this.frontRight = new Wheel(diameter, tireType);
		this.frontLeft = new Wheel(diameter, tireType);
		this.rearRight = new Wheel(diameter, tireType);
		this.rearLeft = new Wheel(diameter, tireType);
		this.wheel = new Wheel(diameter, tireType);
		System.out.println("Wheel change success");
	}

	public void run() {
		System.out.println("Car run");
	}

	public void refuel() {
		System.out.println("Car refuel");
	}

	public void infoAuto() {
		System.out.printf(
				"Auto model %s whith engineCapacity %s and numberOfCylinders %s, wheell whith diameter %s and tiretype %s\n",
				getModel(), engine.getEngineCapacity(), engine.getNumberOfCylinders(), wheel.getDiameter(),
				wheel.getTireType());
	}

}
