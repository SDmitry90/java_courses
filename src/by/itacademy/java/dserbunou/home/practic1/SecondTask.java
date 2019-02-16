package by.itacademy.java.dserbunou.home.practic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SecondTask {

	public static void main(String[] args) throws NumberFormatException, IOException {

		final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Введите размер массива:");

		final int arraySize = Integer.parseInt(bufferedReader.readLine());
		final int[] array = new int[arraySize];

		System.out.printf("Получили такой массив: %s \n", Arrays.toString(array));

		// запись значений в массив
		for (int i = 0; i < arraySize; i++) {
			System.out.printf("Введите %s элемент массива:\n", i);
			final int element = Integer.parseInt(bufferedReader.readLine());
			array[i] = element;
		}
		System.out.printf("Массив с введенными значениями %s \n", Arrays.toString(array));

		// обратный вывод значений на экран - для своего понимания
		/*
		 * for (int i = 0; i < array.length; i++) { int x = array[i];
		 * System.out.printf("%s \n", x); }
		 */
		int maxL = 0;
		int minL = 0;
		int maxNumber = 0;
		int minNumber = 0;

		for (int d : array) {
			String noname = d + "";
			int length = noname.length();
			System.out.printf("%s \n", length);

			if (length > maxL) {
				maxL = length;
				maxNumber = d;
			}
			if (length < minL || minL == 0) {
				minL = length;
				minNumber = d;
			}
		}
		System.out.printf("Максимальное число %s с длиной %s \nМинимальное число %s с длинной %s \n", maxNumber, maxL,
				minNumber, minL);
	}
}
