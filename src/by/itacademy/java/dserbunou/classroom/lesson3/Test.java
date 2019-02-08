package by.itacademy.java.dserbunou.classroom.lesson3;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		boolean isMultiplyAction = generateBoolean();
		int i1 = generateInteger();
		int i2 = generateInteger();

		int result = 0;
		if (isMultiplyAction) {
			result = i1 * i2;
		} else {
			result = i1 / i2;
		}
		System.out.printf("i1=%s, i2=%s, result=%s", i1, i2, result);
	}

	private static boolean generateBoolean() {
		Random random = new Random();
		int value = random.nextInt(3);
		return value > 1;
	};

	private static int generateInteger() {
		Random random = new Random();
		int value = random.nextInt(Integer.MAX_VALUE);
		return value;
	};
}

/*Debug - жук, f6 - вперед на шаг, f8 - до следующего breakpoint, ctrl+shift+I - выделить и узнать результат целого метода, услови€ (i<5), ctrl - наводим на класс, переменную и видим, где объ€вл€етс€*/