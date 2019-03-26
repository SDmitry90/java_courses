package by.itacademy.java.dserbunou.classroom.lesson11Streams;

public class RunThread1 {
    public static class HelloThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello from a thread");
        }
    }

    public static void main(String[] args) {
        HelloThread helloThread = new HelloThread();
        helloThread.start();
    }

}
