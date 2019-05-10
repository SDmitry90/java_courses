package by.itacademy.java.dserbunou.classroom.lesson8.collections;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        words.add("one"); // добавление элементов
        words.add("two");
        words.add("three");
        System.out.println("first word is: " + words.get(0));
        words.remove(0); // удаление нулевого элемента
        System.out.println("first word after is: " + words.get(0));
        words.get(0);
    }

}
