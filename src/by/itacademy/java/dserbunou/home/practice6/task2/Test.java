package by.itacademy.java.dserbunou.home.practice6.task2;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import javax.swing.filechooser.FileSystemView;

public class Test {

	public static void main(String[] args) {

		getLetter();

	}

	private static void getLetter() {
		List<File> files = Arrays.asList(File.listRoots());
		for (File f : files) {
			String s1 = FileSystemView.getFileSystemView().getSystemDisplayName(f);
			// String s2 = FileSystemView.getFileSystemView().getSystemTypeDescription(f);
			System.out.println("getSystemDisplayName : " + s1);
			// System.out.println("getSystemTypeDescription : " + s2);
			break;
		}
	}

}
