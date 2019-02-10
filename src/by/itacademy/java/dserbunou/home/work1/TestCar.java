package by.itacademy.java.dserbunou.home.work1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestCar {

	public static void main(String[] args) throws IOException {
		Car Car1 = new Car();
		Car1.year = 2018;
		Car1.color = "red";
		Car1.carBody = "sedan";

		Car Car2 = new Car();
		Car2.year = 2017;
		Car2.color = "white";
		Car2.carBody = "bus";

		welcome();

		String line = user();

		if (line.equals(Car1.color)) {
			Car1.printCarOptions();
		} else {
			if (line.equals(Car2.color)) {
				Car2.printCarOptions();
			} else {
				System.out.println("Машин с таким цветом у нас нет");
			}
		}
	}

	private static String user() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line = bufferedReader.readLine();
		return line;
	}

	static void welcome() {
		System.out.println("Введите желаемый цвет машины, а мы подскажем есть ли у нас такая:");
	}

}
