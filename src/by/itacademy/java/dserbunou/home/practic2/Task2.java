package by.itacademy.java.dserbunou.home.practic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Task2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите размер сторны квадратного массива:");
		final int arraySize = Integer.parseInt(bufferedReader.readLine());
		double[][] a = new double[arraySize][arraySize];

		printerRandMatrix(a);

		printerRoundMatrix(a);

		delIdelJ(arraySize, a);

		final double[][] a1 = new double[arraySize - 1][arraySize - 1];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = Math.round(Math.random() * 200 - 100);
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

		double zero = 0;
		int q = 0;
		int p = 0;
		zero = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == 0) {
					zero = a[i][j];
					q = i;
					p = j;
				}
			}
		}
		System.out.println();
		System.out.println("Максимальный элемент и его положение");
		System.out.print(zero + " строка " + q + " столбец " + p);

		System.out.println();
		System.out.println();

		int deli, delj;
		deli = arraySize;
		delj = arraySize;
		for (int i = 0, ln = 0; ln < arraySize - 1;) {
			if (i != deli - 1) {
				for (int j = 0, cn = 0; cn < arraySize - 1; j++, cn++) {
					if (j == delj - 1)
						j++;
					a1[ln][cn] = a[i][j];
				}
				i++;
				ln++;
			} else
				i++;
		}
		a = a1;
		for (int i = 0; i < arraySize - 1; i++) {
			for (int j = 0; j < arraySize - 1; j++) {
				System.out.print(a[i][j] + "    ");
			}
			System.out.println();
		}

	}

	private static void delIdelJ(final int arraySize, double[][] a) {
		final double[][] a1 = new double[arraySize - 1][arraySize - 1];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = Math.round(Math.random() * 200 - 100);
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		double max = 0;
		int q = 0;
		int p = 0;
		max = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (max < a[i][j]) {
					max = a[i][j];
					q = i;
					p = j;
				}
			}
		}
		System.out.println();
		System.out.println("Максимальный элемент и его положение");
		System.out.print(max + " строка " + q + " столбец " + p);

		System.out.println();
		System.out.println();

		int deli, delj;
		deli = arraySize;
		delj = arraySize;
		for (int i = 0, ln = 0; ln < arraySize - 1;) {
			if (i != deli - 1) {
				for (int j = 0, cn = 0; cn < arraySize - 1; j++, cn++) {
					if (j == delj - 1)
						j++;
					a1[ln][cn] = a[i][j];
				}
				i++;
				ln++;
			} else
				i++;
		}
		a = a1;
		for (int i = 0; i < arraySize - 1; i++) {
			for (int j = 0; j < arraySize - 1; j++) {
				System.out.print(a[i][j] + "    ");
			}
			System.out.println();
		}
	}

	private static void printerRoundMatrix(final double[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = Math.round(Math.random() * 200 - 100);
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static void printerRandMatrix(final double[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = Math.random() * 200 - 100;
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
