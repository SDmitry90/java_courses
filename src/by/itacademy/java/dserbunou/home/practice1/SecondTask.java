package by.itacademy.java.dserbunou.home.practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import com.sun.org.apache.xpath.internal.axes.ReverseAxesWalker;

public class SecondTask {

	public static void main(String[] args) throws NumberFormatException, IOException {

		final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("������� ������ �������:");

		final int arraySize = Integer.parseInt(bufferedReader.readLine());
		final int[] array = new int[arraySize];

		System.out.printf("�������� ����� ������: %s \n", Arrays.toString(array));

		// ������ �������� � ������
		for (int i = 0; i < arraySize; i++) {
			System.out.printf("������� %s ������� �������:\n", i);
			final int element = Integer.parseInt(bufferedReader.readLine());
			array[i] = element;
		}
		System.out.printf("������ � ���������� ���������� %s \n", Arrays.toString(array));

		 maxMinValue(array);
		
		/* averageValue(arraySize, array); double averageValue = averageValue(arraySize,
		  array); System.out.printf("������� ����� %s \n", averageValue);
		  
		  minAverageMaxAverage(array, averageValue);
		  
		  evenNumbers(array);
		  
		  dividedByThreeFive(array);
		  
		  primeNumber(array);
		  
		  isPalindrome(array);
		 
		int x, y, z;
		for (int d : array) {

			do {
				x = d % 10;
				y = d / 10;
				z = y % 10;
				if (x > z) {
					y = y / 10;
					x = y % 10;
					if (z > x) {
					}
				}
			} while (x == 0);
		}*/
	}

	private static void isPalindrome(final int[] array) {
		for (int d : array) {
			String noname = d + "";
			String reverse = new StringBuffer(noname).reverse().toString();
			if (noname.equals(reverse)) {
				System.out.printf("���������: %s \n", d);
			}
		}
	}

	private static void primeNumber(final int[] array) {
		int i = 1;
		for (int d : array) {
			if ((d == 2 || d == 3 || d == 5 || d == 7) || (d % 2 != 0 && d % 3 != 0 && d % 5 != 0 && d % 7 != 0)) {
				System.out.printf("%s ������� �����: %s \n", i, d);
				i++;
			}
		}
	}

	private static void dividedByThreeFive(final int[] array) {
		int i = 1;
		for (int d : array) {
			if (d % 3 == 0 && d % 5 == 0) {
				System.out.printf("%s �����, ������� ������� �� 3 � �� 5: %s \n", i, d);
				i++;
			}
		}
	}

	private static void evenNumbers(final int[] array) {
		int i = 1;
		for (int d : array) {
			if (d % 2 == 0) {
				System.out.printf("%s ������ ����� %s \n", i, d);
				i++;
			}
		}
		System.out.println("������ ������ ����� ���");
	}

	private static void minAverageMaxAverage(final int[] array, double averageValue) {
		int i = 1, j = 1;
		for (int d : array) {
			String noname = d + "";
			int length = noname.length();
			if (length <= averageValue) {
				System.out.printf("%s ����� � ������ ������ ������� %s \n", i, d);
				i++;
			} else {
				System.out.printf("%s ����� � ������ ������ ������� %s \n", j, d);
				j++;
			}
		}
	}

	private static Double averageValue(final int arraySize, final int[] array) {
		int size = 0;
		double averageValue = 0;
		for (int d : array) {
			String noname = d + "";
			int length = noname.length();
			size += length;
			averageValue = (double) size / arraySize;
		}
		return averageValue;
	}

	private static void maxMinValue(final int[] array) {
		int maxL = 0;
		int minL = 0;
		int maxNumber = 0;
		int minNumber = 0;

		for (int d : array) {
			String noname = d + "";
			int length = noname.length();

			if (length > maxL) {
				maxL = length;
				maxNumber = d;
			}
			if (length < minL || minL == 0) {
				minL = length;
				minNumber = d;
			}
		}
		System.out.printf("Max value %s � ������ %s \n����������� ����� %s � ������� %s \n", maxNumber, maxL,
				minNumber, minL);
	}
}
