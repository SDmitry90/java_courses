package by.itacademy.java.dserbunou.classroom.practice.mail;

import java.util.Queue;

public class Consumer extends Thread {

    private static final int EMAIL_PROCESSING_PAUSE = 3000;

    private static final int NO_EMAIL_PAUSE = 10000;

    private Queue<Email> queue;

    public Consumer(Queue<Email> queue, String name) {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            Email e;
            String threadName = getName();
            synchronized (queue) {
                e = queue.poll();
            }
            if (e == null) {
                if (Task1.LIMIT_REACHED) {
                    LogPrinter.printLine(String.format("%s остановлен в связи с достижением лимита", threadName));
                    return;
                }

                try {
                    Thread.sleep(NO_EMAIL_PAUSE);
                } catch (InterruptedException e1) {
                    stopWork(true);
                    return;
                }
            } else {
                try {
                    Thread.sleep(EMAIL_PROCESSING_PAUSE);
                } catch (InterruptedException e1) {
                    stopWork(false);
                    return;
                }

                LogPrinter.printLine(String.format("%s обработал %s", threadName, e));
            }

        }
        stopWork(true);
    }

    private void stopWork(boolean completedLastEmail) {
        String threadName = getName();
        LogPrinter.printLine(
                String.format("лишние Consumer объекты. Размер очереди=%s. Удален %s", queue.size(), threadName));

    }
}