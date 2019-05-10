package by.itacademy.java.dserbunou.classroom.lesson10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String thisLine = null;
        try (FileReader reader = new FileReader("input.txt"); BufferedReader br = new BufferedReader(reader);) { //паттерн-декоратор используется в java.io
            while ((thisLine = br.readLine()) != null) {
                System.out.println(thisLine);
            }
        }
    }
}
