package by.itacademy.java.dserbunou.classroom.lesson12;

public class JoinRunner {

    public static void main(String[] args) {
        System.out.println("Старт потока main");
        Thread t1 = new JoinThread("1");
        Thread t2 = new JoinThread("2");
        t1.start();
        t2.start();
        try {
            t1.join(500);
            // t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Завершение потока main");
    }
}
