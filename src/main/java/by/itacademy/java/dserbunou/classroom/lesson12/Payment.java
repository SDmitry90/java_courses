package by.itacademy.java.dserbunou.classroom.lesson12;

public class Payment {
    private int amount;

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public synchronized void doPayment() {
        System.out.println("Start payment. Waiting for amount");
        while (amount <= 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Payment completed");
    }
}
