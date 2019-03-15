package by.itacademy.java.dserbunou.home.pratice4.task1;

public class Test {

	public static void main(String[] args) {
		Word word = new Word("Hamlet");
		Text text = new Text(word);

		Word word1 = new Word("To be");
		Word word2 = new Word("or not");
		Word word3 = new Word("to be");

		Sentence sentence = new Sentence();
		sentence.addValue(word1);
		sentence.addValue(word2);
		sentence.addValue(word3);

		text.addText(sentence);

		System.out.println("Head: " + text.getTextHeader());
		System.out.println("Body: " + text.getBody());

	}

}
