package by.itacademy.java.dserbunou.home.practice5.Task1;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {

		final ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(new Car(2017, "Audi"));
		cars.add(new Car(2005, "Nissan"));
		cars.add(new Car(2001, "BMW"));
		cars.add(new Car(2018, "VW"));
		cars.add(new Car(2014, "Skoda"));

		Collections.sort(cars, new CarModelComparator());
		System.out.println(cars);
		Collections.sort(cars, new CarYearComparator());
		System.out.println(cars);

		// Collections.sort(cars);

	}

}
