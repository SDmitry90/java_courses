package by.itacademy.java.dserbunou.classroom.lesson10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerialiazationSample {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("t.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeInt(12345);
        oos.writeObject("Today");
        oos.writeObject(new Car("wwww", 222));
        oos.close();
    }
}
