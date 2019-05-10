package by.itacademy.java.dserbunou.classroom.parsers.model;

public class ParsingResult {
    private int itemsQuantity;
    private Food itemHighestPrice;
    private Food itemLowestPrice;
    private double totalPrice;

    public int getItemsQuantity() {
        return itemsQuantity;
    }

    public void setItemsQuantity(int itemsQuantity) {
        this.itemsQuantity = itemsQuantity;
    }

    public Food getItemHighestPrice() {
        return itemHighestPrice;
    }

    public void setItemHighestPrice(Food itemHighestPrice) {
        this.itemHighestPrice = itemHighestPrice;
    }

    public Food getItemLowestPrice() {
        return itemLowestPrice;
    }

    public void setItemLowestPrice(Food itemLowestPrice) {
        this.itemLowestPrice = itemLowestPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "itemsQuantity=" + itemsQuantity + "\nitemHighestPrice=" + itemHighestPrice + "\nitemLowestPrice="
                + itemLowestPrice + "\ntotalPrice=" + totalPrice;
    }

}
