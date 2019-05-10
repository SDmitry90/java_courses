package by.itacademy.java.dserbunou.classroom.lesson10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileBytes {

    public static void main(String[] args) throws IOException {
        // FileInputStream in = null;
        // FileOutputStream out = null;
        try (FileInputStream in = new FileInputStream("Input.txt");              // можно писать объявление потоков ввода вывода в этой секции
                FileOutputStream out = new FileOutputStream("Output.txt");) {    // тогда finally не нужно
            // in = new FileInputStream("Input.txt");
            // out = new FileOutputStream("Output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {

            // if (in != null) {
            // in.close(); // закрытие потока
            // }
            // if (out != null) {
            // out.close();
            // }
        }

    }

}
