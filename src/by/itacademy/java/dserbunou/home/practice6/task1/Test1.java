package by.itacademy.java.dserbunou.home.practice6.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File dir = new File("C:\\Test1");
		dir.mkdir();

		List<String> txt = addText();

		for (String word : txt) {

			File dir2 = new File("C:\\Test1", word.substring(0, 1));
			dir2.mkdir();

			// boolean created = dir.mkdir();

			try (FileWriter fw = new FileWriter("words.txt", true);
					BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter out = new PrintWriter(bw)) {
				out.println(word.substring(0, 1));
				out.println(word);
			} catch (IOException e) {
			}

		}

	}

	private static List<String> addText() throws IOException, FileNotFoundException {
		List<String> txt = new ArrayList<String>();
		String text = null;
		try (FileReader reader = new FileReader("SampleTextFile_10kb (1).txt");
				BufferedReader br = new BufferedReader(reader);) {
			while ((text = br.readLine()) != null) {
				text = text.replaceAll("[,.]", "");
				putInSet(text.split(" "), txt);
			}
		}
		return txt;
	}

	public static void putInSet(String[] arr, List<String> list) {
		for (String word : arr) {
			list.add(word);
		}
	}
}
