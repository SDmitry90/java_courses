package by.itacademy.java.dserbunou.classroom.lesson10;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Serializable;

public class Car implements Serializable {

    private static final long serialVersionUID = 2L; // меняется в зависимости от появления или удаления новых свойств, вручную пишем, если хотим, чтобы сериализация прошла

    private transient InputStream is = new ByteArrayInputStream(new byte[] {});

    private String vin;
    private int year;

    Car(String vin, int year) {
        super();
        this.vin = vin;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car [is=" + is + ", vin=" + vin + ", year=" + year + "]";
    }

}
