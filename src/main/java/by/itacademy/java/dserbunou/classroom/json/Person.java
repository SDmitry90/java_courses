package by.itacademy.java.dserbunou.classroom.json;

import java.util.List;

public class Person {

    private String name;
    private Integer age;
    private Boolean isMarried;
    private List<String> hobbies;
    private List<Person> kids;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Boolean getIsMarried() {
        return isMarried;
    }
    public void setIsMarried(Boolean isMarried) {
        this.isMarried = isMarried;
    }
    public List<String> getHobbies() {
        return hobbies;
    }
    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
    public List<Person> getKids() {
        return kids;
    }
    public void setKids(List<Person> kids) {
        this.kids = kids;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", isMarried=" + isMarried + ", hobbies=" + hobbies + ", kids="
                + kids + "]";
    }
    
}
