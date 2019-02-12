package by.itacademy.java.dserbunou.home.practic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SecondTask {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter array size:");

        final int arraySize = Integer.parseInt(bufferedReader.readLine());

        final int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.printf("enter %s array element:\n", i);
            final int element = Integer.parseInt(bufferedReader.readLine());
            array[i] = element;
        }

        System.out.printf("entered array %s:\n", Arrays.toString(array));

        int numberShort = 0;
        int numberLong = 0;

        for (int element : array) {
            final String Str = element + "";
            final int length = Str.length();
            if (length > numberShort) {
                numberShort = length;
                numberShort = element;
            }
            System.out.printf("maxlength =%s of element=%s", numberShort, numberShort);

        }

    }

}
