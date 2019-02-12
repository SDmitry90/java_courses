package by.itacademy.java.dserbunou.home.practic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTask {

    public static void main(String[] args) throws IOException {

        int number;

        do {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите число от 1 до 12");
            number = Integer.parseInt(bufferedReader.readLine());

        } while (1 > number || number > 12);

        switch (number) {
        case 1:
            System.out.println("Январь");
            break;
        case 2:
            System.out.println("Февраль");
            break;
        case 3:
            System.out.println("Март");
            break;
        case 4:
            System.out.println("Апрель");
            break;
        case 5:
            System.out.println("Май");
            break;
        case 6:
            System.out.println("Июнь");
            break;
        case 7:
            System.out.println("Июль");
            break;
        case 8:
            System.out.println("Август");
            break;
        case 9:
            System.out.println("Сентябрь");
            break;
        case 10:
            System.out.println("Октябрь");
            break;
        case 11:
            System.out.println("Ноябрь");
            break;
        case 12:
            System.out.println("Декабрь");
            break;
        }

    }
}
