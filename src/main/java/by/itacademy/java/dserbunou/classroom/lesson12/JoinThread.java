package by.itacademy.java.dserbunou.classroom.lesson12;

public class JoinThread extends Thread {

    public JoinThread(String name) {
        super(name);

    }

    @Override
    public void run() {
        String threadName = getName();
        long timeout = 0;
        System.out.println("Старт потока" + threadName);
        try {
            switch (threadName) {
            case "1":
                timeout = 5_000;
                break;
            case "2":
                timeout = 1_000;

                break;
            }
            Thread.sleep(timeout);
            System.out.println("Завершение потока " + threadName);

        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
    }
}
