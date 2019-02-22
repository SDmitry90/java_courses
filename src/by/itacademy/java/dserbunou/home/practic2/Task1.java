package by.itacademy.java.dserbunou.home.practic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Task1 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите размер сторны квадратного массива:"); //Введите размер сторны квадратного массива:
		final int arraySize = Integer.parseInt(bufferedReader.readLine());
		final int[][] array = new int[arraySize][arraySize];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = i + (j + 1);
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
