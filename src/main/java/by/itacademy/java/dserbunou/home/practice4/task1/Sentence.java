package by.itacademy.java.dserbunou.home.practice4.task1;

public class Sentence {
	private String words ="";

	public void addValue(Word word) {
		words += " " + word.getValue();
	}

	public String getWords() {
		return words;
	}

}
