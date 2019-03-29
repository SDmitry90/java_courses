package by.itacademy.java.dserbunou.classroom.lesson12;

public class Task implements Runnable {

    private String name;
    private int pause;

    public Task(String name, int pause) {
        this.name = name;
        this.pause = pause;
    }

    @Override
    public void run() {
        System.out.printf("Executing task %s inside %s %n", name, Thread.currentThread().getName());
        try {
            Thread.sleep(pause);
            System.out.printf("task %s completed %n", name);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
