package by.itacademy.java.dserbunou.classroom.JDK8;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ParallelStreamPerfomance {

    public static void main(String[] args) {

        List<String> values = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        sortSequential(values);
        sortParallel(values);

    }

    private static void sortSequential(List<String> values) {
        // TODO Auto-generated method stub
        long t0 = System.nanoTime();
        values.stream().sorted().count();
        System.out.printf("Sort took: %d ns %n", System.nanoTime() - t0);

    }

    private static void sortParallel(List<String> values) {
        long t0 = System.nanoTime();
        values.parallelStream().sorted().count();
        System.out.printf("Parallel sort took: %d ns %n", System.nanoTime() - t0);
    }
}
