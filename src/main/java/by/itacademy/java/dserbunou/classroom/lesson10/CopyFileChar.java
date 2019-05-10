package by.itacademy.java.dserbunou.classroom.lesson10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileChar {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        try (FileReader in = new FileReader("Input.txt"); FileWriter out = new FileWriter("Output.txt");) {

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {

        }

    }

}
