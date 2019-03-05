package by.itacademy.java.dserbunou.classroom.lesson8.collections;

import java.util.HashMap;

public class Test2 {

    public static void main(String[] args) {
        HashMap<Integer, String> words = new HashMap<Integer, String>();
        words.put(1, "First");
        words.put(2, "Two");
        words.put(3, "Three");
        System.out.println("Map: " + words);
        System.out.println("Word is " + words.get(3));

    }
}
