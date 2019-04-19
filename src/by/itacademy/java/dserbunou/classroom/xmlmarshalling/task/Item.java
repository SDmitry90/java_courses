package by.itacademy.java.dserbunou.classroom.xmlmarshalling.task;

public class Item {
    private String title;
    private Integer quantity;
    private Double price;

    public Item() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" + "title='" + title + '\'' + ", quantity=" + quantity + ", price=" + price + '}';
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
