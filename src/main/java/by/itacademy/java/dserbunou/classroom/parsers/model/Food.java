package by.itacademy.java.dserbunou.classroom.parsers.model;

public class Food {
    private String name;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food [name=" + name + ", price=" + price + "]";
    }

}