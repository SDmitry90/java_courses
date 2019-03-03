package by.itacademy.java.dserbunou.home.book;

public class MyRect {
	protected int x1;
	protected int y1;
	protected int x2;
	protected int y2;

	MyRect(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public void setMyRect(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public String toString() {
		String sz = "Object MyRect: (" + x1 + ", " + y1 + ", " + x2 + ", " + y2 + ")";

		return sz;
	}
}
