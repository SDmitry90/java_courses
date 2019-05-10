package by.itacademy.java.dserbunou.classroom.JDK8;

import java.util.function.Consumer;

public class Reference {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Consumer<String> printFunction = System.out::print; // :: - ссылка на метод
        printFunction.accept("Hello world");

    }

}
