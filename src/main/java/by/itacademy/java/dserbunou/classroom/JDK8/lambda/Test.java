package by.itacademy.java.dserbunou.classroom.JDK8.lambda;

import java.util.Arrays;
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Arrays.asList("a", "b", "d").forEach(new Consumer<String>() {
            @Override
            public void accept(String e) {
                System.out.println(e);
            }
        });
        Arrays.asList("a", "b", "d").forEach(e -> System.out.println(e)); //лямбда выражение
    }
}
