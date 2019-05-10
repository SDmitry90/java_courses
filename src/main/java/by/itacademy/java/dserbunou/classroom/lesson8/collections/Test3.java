package by.itacademy.java.dserbunou.classroom.lesson8.collections;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    private static int i;

    private static class Sample {

        private final int number;

        public Sample() {
            this.number = ++i;
        }

        @Override
        public boolean equals(Object obj) {
            System.out.println("equals called for s" + number);
            return super.equals(obj);
        }
    }

    public static void main(String[] args) {
        List<Sample> list = new ArrayList<>();
        final Sample s1 = new Sample();
        final Sample s2 = new Sample();
        final Sample s3 = new Sample();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        list.contains(s1);
        list.indexOf(s2);
        list.remove(s3);
    }

}
