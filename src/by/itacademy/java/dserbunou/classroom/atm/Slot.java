package by.itacademy.java.dserbunou.classroom.atm;

import java.util.List;

public class Slot implements Comparable<Slot> {
    private final int nominal;
    private int quantity;

    public Slot(final int nominal) {
        super();
        this.nominal = nominal;
    }

    public int getNominal() {
        return nominal;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(final int quantity) {
        this.quantity += quantity;
    }

    public void removeQuantity(final int quantity) {
        this.quantity += quantity;
    }

    public boolean isApplicable(final int nominal) {
        return this.nominal == nominal;

    }

    public String printAtmStatus() {

        final List<Slot> slots = getSlots();
        System.out.println("ATM");

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Slot [nominal=]";
    }

    @Override
    public int compareTo(Slot o) {
        return 0;
        // TODO Auto-generated method stub
    }

}
