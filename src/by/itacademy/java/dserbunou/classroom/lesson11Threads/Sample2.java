package by.itacademy.java.dserbunou.classroom.lesson11Threads;

import java.util.concurrent.atomic.AtomicLong;

public class Sample2 {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        for (int i = 0; i < 200; i++) {
            CounterThread ct = new CounterThread(counter);
            ct.start();
        }

        Thread.sleep(1000);
        System.out.println("Counter " + counter.getCounter());
    }

    public static class Counter {
        private AtomicLong counter = new AtomicLong(0);

        public AtomicLong getCounter() {
            return counter;
        }

        public void increaseCounter() {
            counter.incrementAndGet();
        }
    }

    /*
     * public static class Counter { // private volatile long counter = 0L; //
     * volatile - свойство отключило локальный кеш, то есть поток работает с //
     * памятью напрямую
     * 
     * private AtomicLong counter = new AtomicLong(0);
     * 
     * public AtomicLong getCounter() { return counter; }
     * 
     * public void increaseCounter() { counter.incrementAndGet(); } } /* public long
     * getCounter() { return counter; }
     * 
     * public synchronized void increaseCounter() { counter++; } }
     */

    public static class CounterThread extends Thread {
        private Counter counter;

        public CounterThread(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                counter.increaseCounter();
            }
        }
    }
}