package by.itacademy.java.dserbunou.classroom.lesson11Streams;

public class ExceptThread extends Thread {
    @Override
    public void run() {
        System.out.println("start");
        boolean flag = true;
        if (flag) {
            throw new RuntimeException();
        }
        System.out.println("end of ExceptThread");
    }
}
