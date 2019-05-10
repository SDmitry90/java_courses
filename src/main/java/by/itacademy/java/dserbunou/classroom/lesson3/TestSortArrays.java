package by.itacademy.java.dserbunou.classroom.lesson3;

import java.util.Arrays;

public class TestSortArrays {

	public static void main(String[] args) {
		int[] array = { 2, 7, 6, 3, 0, 1 };
		Arrays.sort(array);
		for (int element : array) {
			System.out.print(element + "  ");
		}
	}

}
