package by.itacademy.java.dserbunou.classroom.atm;

import java.util.Collections;
import java.util.List;

public class Atm {

    private List<Slot> slots;

    public Atm(List<Slot> slots) {
        super();
        Collections.sort(slots);
        Collections.reverse(slots);
        this.slots = slots;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public void withdraw(int sum) {
        final List<Slot> slots = getSlots();

        // TODO Auto-generated method stub

    }

    public void addMoney(int nominal, int quantity) {
        // TODO Auto-generated method stub
        if (quantity < 0) {
            throw new IllegalArgumentException("quantity shoud be positive intead of" + quantity);
        }
        final List<Slot> slots = getSlots();
        for (Slot slot : slots) {
            if (slot.isApplicable(nominal)) {
                slot.addQuantity(quantity);
                return;
            }

        }
        throw new IllegalArgumentException("can't find slot for nominal" + quantity);
    }

}
