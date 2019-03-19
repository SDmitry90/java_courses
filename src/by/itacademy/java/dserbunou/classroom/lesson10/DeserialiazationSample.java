package by.itacademy.java.dserbunou.classroom.lesson10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class DeserialiazationSample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("t.tmp");
        ObjectInputStream ois = new ObjectInputStream(fis);
        int i = ois.readInt();
        String today = (String) ois.readObject();
        Car date = (Car) ois.readObject();
        ois.close();
        System.out.printf("%s %s %s", i, today, date);

    }
}
