package by.itacademy.java.dserbunou.classroom.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2. ������� �������� ���������� ��������� ����� � ��������� � ��� �������� �� ����� ������.

public class TestHome2 {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		/*
		 * System.out.println("������� ���������� ����"); int count =
		 * Integer.parseInt(bufferedReader.readLine());
		 */

		String line = bufferedReader.readLine(); // input from console

		printMessage(line);
	}

	private static void printMessage(String line) {
		String x = "Hello, " + line;
		System.out.println(x);
	}
}

// rename - ALT+SHIFT+R
// extract variable/method - ALT+SHIFT+T
