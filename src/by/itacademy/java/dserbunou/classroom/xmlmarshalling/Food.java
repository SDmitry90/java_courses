package by.itacademy.java.dserbunou.classroom.xmlmarshalling;

public class Food {
    private String name;
    private String price;
    private String description;
    private Integer calories;

    public Food() {

    }

    public Food(String name, String price) {
        super();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Food [name=" + name + ", price=" + price + ", description=" + description + ", calories=" + calories
                + "]";
    }

}
