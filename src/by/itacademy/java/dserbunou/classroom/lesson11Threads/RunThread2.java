package by.itacademy.java.dserbunou.classroom.lesson11Threads;

public class RunThread2 {
    public static class HelloRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello from a thread");
        }
    }

    public static void main(String[] args) {
        HelloRunnable helloRunnable = new HelloRunnable();
        Thread thread = new Thread(helloRunnable);
        thread.start();
    }

}
