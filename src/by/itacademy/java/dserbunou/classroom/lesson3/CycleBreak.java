package by.itacademy.java.dserbunou.classroom.lesson3;

public class CycleBreak {
	public static void main(String[] args) {
		int i = 17;
		while (i <= 28) {
			if ((i % 13) == 0) {
				break;
			}
			i++;
		}
		System.out.println("first nuber is:" + i);
	}
}
