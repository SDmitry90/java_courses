package by.itacademy.java.dserbunou.home.practic3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.ProtocolException;

public class Task1 {

	public static void main(String[] args) throws MalformedURLException, ProtocolException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter text: ");
		// System.out.println("Enter text link: ");
		// e:/safari downloads/SampleTextFile_10kb.txt
		String text = br.readLine();
		// File f = new File(text);
		// BufferedReader fin = new BufferedReader(new FileReader(f));
		// System.out.println(fin);
		System.out.println("Enter the number of the letter you want to replace: ");
		int numberLatter = Integer.parseInt(br.readLine());

		String[] str = text.split(" +");

		for (String d : str) {
			String noname = d + "";
			int length = noname.length();

			if (length >= numberLatter) {
				char[] nonameChars = noname.toCharArray();
				nonameChars[numberLatter - 1] = '@';
				noname = String.valueOf(nonameChars);
				System.out.print(noname + " ");
			} else {
				System.out.print(noname + " ");
			}
		}
	}
}
