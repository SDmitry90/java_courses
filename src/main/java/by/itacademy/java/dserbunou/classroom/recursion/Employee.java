package by.itacademy.java.dserbunou.classroom.recursion;

import java.util.List;
import java.util.Random;

public class Employee {
    int age;
    List<Employee> subordinates;
   
    
    
    
    public Employee(int age, List<Employee> subordinates) {
        super();
        this.age = age;
        this.subordinates = subordinates;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public List<Employee> getSubordinates() {
        return subordinates;
    }
    public void setSubordinates(List<Employee> subordinates) {
        this.subordinates = subordinates;
    }
    
    
    
    

    // Random random = new Random();
    // int age = 20 + random.nextInt(61 - 20);

}
