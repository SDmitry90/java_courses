package by.itacademy.java.dserbunou.home.practice5.task1;

import java.util.Comparator;

public class CarModelComparator implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		return o1.getModel().compareTo(o2.getModel());
	}

}
