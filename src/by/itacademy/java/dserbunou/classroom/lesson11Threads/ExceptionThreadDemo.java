package by.itacademy.java.dserbunou.classroom.lesson11Threads;

public class ExceptionThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        new ExceptThread().start();
        Thread.sleep(1000); //усыпление на секунду
        System.out.println("end of main");
    }

}
