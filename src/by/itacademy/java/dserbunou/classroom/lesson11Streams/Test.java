package by.itacademy.java.dserbunou.classroom.lesson11Streams;

public class Test {
    private static class SleepingThread extends Thread {
        public SleepingThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            long startTime = System.currentTimeMillis();
            while (true) {
                try {
                    if (System.currentTimeMillis() - startTime < 5000) {
                        continue;

                    }
                    Thread.sleep(10000);
                    startTime = System.currentTimeMillis();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }

    }

    public static void main(String[] args) {
        int threadCount = 0;
        long startTime = System.currentTimeMillis();
        while (true) {
            if (System.currentTimeMillis() - startTime < 5000) {
                continue;
            }
            new SleepingThread("SleepingThread" + ++threadCount).start();
            startTime = System.currentTimeMillis();
        }
    }

}
