package by.itacademy.java.dserbunou.home.practice4.task2;

public class Wheel {

	private final int DIAMETER = 14;
	private final String TIRETYPE = "summer";
	private int diameter;
	private String tireType;

	public Wheel() {
		super();
		this.diameter = DIAMETER;
		this.tireType = TIRETYPE;
	}

	public Wheel(int diameter, String tireType) {
		super();
		this.diameter = diameter;
		this.tireType = tireType;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public String getTireType() {
		return tireType;
	}

	public void setTireType(String tireType) {
		this.tireType = tireType;
	}

}
