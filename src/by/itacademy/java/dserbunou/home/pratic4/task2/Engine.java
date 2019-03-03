package by.itacademy.java.dserbunou.home.pratic4.task2;

public class Engine {

	private final double ENGINECAPACITY = 1.6;
	private final int NUMBEROFCYLINDERS = 4;
	private double engineCapacity;
	private int numberOfCylinders;

	public Engine() {
		super();
		this.engineCapacity = ENGINECAPACITY;
		this.numberOfCylinders = NUMBEROFCYLINDERS;
	}

	public Engine(double engineCapacity, int numberOfCylinders) {
		super();
		this.engineCapacity = engineCapacity;
		this.numberOfCylinders = numberOfCylinders;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}

	public void setNumberOfCylinders(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}

	public void engineType() {
		System.out.printf("EngineCapacity %s, numberOfCylinders %s", getEngineCapacity(), getNumberOfCylinders());
	}

}
