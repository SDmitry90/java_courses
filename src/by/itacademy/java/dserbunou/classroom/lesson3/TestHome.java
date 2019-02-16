package by.itacademy.java.dserbunou.classroom.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1. ѕриветствовать любого пользовател€ при вводе его имени через командную строку.

public class TestHome {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line = bufferedReader.readLine(); // input from console

		printMessage(line);
	}

	private static void printMessage(String line) {
		String x = "Hello, " + line;
		System.out.println(x);
	}
}
