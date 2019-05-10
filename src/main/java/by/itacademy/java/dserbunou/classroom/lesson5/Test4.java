package by.itacademy.java.dserbunou.classroom.lesson5;

import java.util.Calendar;
import java.util.Date;

public class Test4 {

    public static void main(String[] args) {
        Date date = new Date(); // текущая дата
        System.out.println(date);
        // System.out.println(date.getTime());
        Calendar anotherDate = Calendar.getInstance();
        System.out.printf("%s vs %s \n", date.getTime(), anotherDate.getTime());

        anotherDate.add(Calendar.DAY_OF_YEAR, -3);
        anotherDate.add(Calendar.SECOND, -4);
        System.out.println("shifted:" + anotherDate.getTime());

    }

}
