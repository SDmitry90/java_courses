package by.itacademy.java.dserbunou.classroom.lesson12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedPoolExample {

    public static void main(String[] args) {

        ExecutorService poolExecutor = Executors.newFixedThreadPool(2);

        Task t1 = new Task("t1", 4000);
        Task t2 = new Task("t2", 9000);
        Task t3 = new Task("t3", 3000);

        poolExecutor.submit(t1);
        poolExecutor.submit(t2);
        poolExecutor.submit(t3);
        poolExecutor.shutdown();

    }

}
