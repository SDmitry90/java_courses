package by.itacademy.java.dserbunou.home.practic3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter text: ");
		String text = br.readLine();

		String[] str = text.split(" +");

		maxLenght(str);

		minLenght(str);

	}

	private static void minLenght(String[] str) {
		int minLength = str[0].length();

		for (String word : str) {
			if (word.length() < minLength) {
				minLength = word.length();
			}
		}

		for (String word : str) {
			if (word.length() == minLength) {
				System.out.println("Min lenght: \n" + word);
			}
		}
	}

	private static void maxLenght(String[] str) {
		int maxLength = str[0].length();

		for (String word : str) {
			if (word.length() > maxLength) {
				maxLength = word.length();
			}
		}

		for (String word : str) {
			if (word.length() == maxLength) {
				System.out.println("Max lenght: \n" + word);
			}
		}
	}

}
