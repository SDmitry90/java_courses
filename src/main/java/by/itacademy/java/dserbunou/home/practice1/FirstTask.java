package by.itacademy.java.dserbunou.home.practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTask {

    public static void main(String[] args) throws IOException {

        int number;

        do {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("������� ����� �� 1 �� 12");
            number = Integer.parseInt(bufferedReader.readLine());

        } while (1 > number || number > 12);

        switch (number) {
        case 1:
            System.out.println("������");
            break;
        case 2:
            System.out.println("�������");
            break;
        case 3:
            System.out.println("����");
            break;
        case 4:
            System.out.println("������");
            break;
        case 5:
            System.out.println("���");
            break;
        case 6:
            System.out.println("����");
            break;
        case 7:
            System.out.println("����");
            break;
        case 8:
            System.out.println("������");
            break;
        case 9:
            System.out.println("��������");
            break;
        case 10:
            System.out.println("�������");
            break;
        case 11:
            System.out.println("������");
            break;
        case 12:
            System.out.println("�������");
            break;
        }

    }
}
