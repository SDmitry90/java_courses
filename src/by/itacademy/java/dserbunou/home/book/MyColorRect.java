package by.itacademy.java.dserbunou.home.book;

import java.awt.Color;

class MyColorRect extends MyRect {
	protected Color rectColor;

	MyColorRect(int x1, int y1, int x2, int y2, Color colr) {
		super(x1, y1, x2, y2);
		rectColor = colr;
	}

	public void setColor(Color colr) {
		rectColor = colr;
	}

	public String toString() {
		String sz = "Object MyRect: (" + x1 + ", " + y1 + ", " + x2 + ", " + y2 + "), " + rectColor.toString();

		return sz;
	}

}