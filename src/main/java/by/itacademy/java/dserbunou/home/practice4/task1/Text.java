package by.itacademy.java.dserbunou.home.practice4.task1;

public class Text {

	private String textHeader;
	private String body ="";

	public Text(Word word) {
		textHeader = word.getValue();
	}

	public Text(Sentence sentence) {
		textHeader = sentence.getWords();
	}

	public String getTextHeader() {
		return textHeader;
	}

	public void addText(Word word) {
		body += " " + word.getValue();
	}

	public void addText(Sentence sentence) {
		body += " " + sentence.getWords();
	}

	public String getBody() {
		return body;
	}
}
