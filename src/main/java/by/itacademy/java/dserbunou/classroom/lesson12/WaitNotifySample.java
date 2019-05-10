package by.itacademy.java.dserbunou.classroom.lesson12;

public class WaitNotifySample {

    public static void main(String[] args) throws InterruptedException {
        Payment payment = new Payment();
        new Thread() {
            @Override
            public void run() {
                payment.doPayment();
            }
        }.start();
        Thread.sleep(2000);

        synchronized (payment) {
            System.out.println("set payment and notify");
            Thread.sleep(2000);
            payment.setAmount(100);
            payment.notify();
        }

        synchronized (payment) {
            payment.wait(1000);
            System.out.println("OK");
        }
    }

}