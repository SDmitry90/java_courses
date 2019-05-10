package by.itacademy.java.dserbunou.classroom.lesson12;

public class Program {

    public static void main(String[] args) {
        final Incremenator incrementatorThread = new Incremenator();
        incrementatorThread.start();

        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(i * 2 * 1000);
            } catch (InterruptedException e) {

            }
            incrementatorThread.changeAction();
        }
      //  incrementatorThread.finish();
        incrementatorThread.interrupt();
    }
}
