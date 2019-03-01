package by.itacademy.java.dserbunou.classroom.generics;

public class Test {

    public static void main(String[] args) {
        final ObjectBox box = new ObjectBox();
        box.setItem("Test");
        final Object item = box.getItem();
        final Integer itemInt = (Integer) item;

        // GenericsBox<String> myBox = new GenericsBox<String>();
        // myBox.setItem("Test");

        GenericsBox myBox = new GenericsBox();
        myBox.setItem("Test");
    }

}
