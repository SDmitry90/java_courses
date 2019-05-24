package by.itacademy.java.dserbunou.classroom.filters;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String password;
    private List<String> allowedResourses = new ArrayList<String>();

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getAllowedResourses() {
        return allowedResourses;
    }

}
