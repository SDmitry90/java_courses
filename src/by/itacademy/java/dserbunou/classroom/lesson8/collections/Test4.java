package by.itacademy.java.dserbunou.classroom.lesson8.collections;

import java.util.HashSet;
import java.util.Set;

public class Test4 {
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

        @Override
        public int hashCode() {
            System.out.println("hashcode called for s" + number);
         //   return super.hashCode();
            return 1;
        }
    }

    public static void main(String[] args) {
        Set<Sample> set = new HashSet<>();
        Sample s1 = new Sample();
        Sample s2 = new Sample();
        Sample s3 = new Sample();
        set.add(s1);
        set.add(s2);
        set.add(s3);

        set.contains(s1);
        set.contains(s2);
        set.remove(s3);

    }
}