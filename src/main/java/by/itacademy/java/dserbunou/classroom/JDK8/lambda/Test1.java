package by.itacademy.java.dserbunou.classroom.JDK8.lambda;

import java.util.Optional;

public class Test1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Optional<String> fullName = Optional.ofNullable(null);
        System.out.println("Full Name is set? " + fullName.isPresent());
        System.out.println("Full Name: " + fullName.orElseGet(() -> "[none]"));
        System.out.println(fullName.map(s -> "Hey " + s + "!").orElse("Hey Stranger"));

    }

}
