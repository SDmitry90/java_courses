package by.itacademy.java.dserbunou.classroom.lesson12;

public class Incremenator extends Thread {
    private volatile boolean isIncrement = true;
    private volatile boolean toBeFinished = false;
    public int mValue = 0;

    public void changeAction() {
        isIncrement = !isIncrement;
    }

    public void finish() {
        this.toBeFinished = true;
    }

    @Override
    public void run() {
        System.out.print("Value =");
        do {
            // if (!toBeFinished) {
            if (!Thread.interrupted()) {
                if (isIncrement) {
                    mValue++;
                } else {
                    mValue--;
                }
                System.out.print(mValue + " ");
            } else {
                return;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
                return;
            }
        } while (true);
    }
}
