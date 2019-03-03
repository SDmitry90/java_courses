package by.itacademy.java.dserbunou.home.book;

import java.awt.Color;

public class ColorRectangle {

	public static void main(String[] args) {
		MyColorRect rect = new MyColorRect(0, 0, 10, 20, Color.black);

	//	String szStr = rect.toString();
		System.out.println(rect.toString());

		rect.setMyRect(10, 20, 30, 40);
		rect.setColor(Color.red);

	//	szStr = rect.toString();
		System.out.println(rect.toString());
	}

}
