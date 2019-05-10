package by.itacademy.java.dserbunou.classroom.practice.mail;

import java.util.Queue;
import java.util.Random;

public class Producer extends Thread {
    private static final Random RND = new Random();

    private Queue<Email> queue;

    public Producer(Queue<Email> queue, String name) {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        String threadName = getName();
        while (true) {
            if (Task1.LIMIT_REACHED) {
                LogPrinter.printLine(String.format("%s остановлен в связи с достижением лимита", threadName));
                return;
            }

            int count = RND.nextInt(2) + 1;

            for (int i = 0; i < count; i++) {
                Email e = new Email();
                queue.add(e);

                LogPrinter.printLine(String.format("%s создал %s", threadName, e));
            }

            int pause = (RND.nextInt(2) + 3) * 1000;
            try {
                Thread.sleep(pause);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}