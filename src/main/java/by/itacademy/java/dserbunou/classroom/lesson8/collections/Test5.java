package by.itacademy.java.dserbunou.classroom.lesson8.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test5 {

    public static void main(String[] args) {
        Set<String> words = new HashSet<String>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        Iterator<String> iteratoe = words.iterator();
        while (iteratoe.hasNext()) {
            System.out.println(iteratoe.next());
        }
    }

}
