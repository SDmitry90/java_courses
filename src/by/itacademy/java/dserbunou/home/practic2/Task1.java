package by.itacademy.java.dserbunou.home.practic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("¬ведите размер сторны квадратного массива:");

		final int arraySize = Integer.parseInt(bufferedReader.readLine());
		final int[][] array = new int[arraySize][arraySize];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		final BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("¬ведите размер сторны квадратного массива:");

		
		
		
	}
}
