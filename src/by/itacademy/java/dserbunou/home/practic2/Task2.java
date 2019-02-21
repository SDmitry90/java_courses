package by.itacademy.java.dserbunou.home.practic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Task2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("¬ведите размер сторны квадратного массива:");
		final int arraySize = Integer.parseInt(bufferedReader.readLine());
		final double[][] a = new double[arraySize][arraySize];

		Random rand = new Random();
		int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextDouble();
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
