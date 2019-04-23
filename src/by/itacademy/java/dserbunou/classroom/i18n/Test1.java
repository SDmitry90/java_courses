package by.itacademy.java.dserbunou.classroom.i18n;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test1 {

    public static void main(String[] args) throws ParseException {

        Locale locale = new Locale("ru", "RU");
        NumberFormat rubFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println(rubFormat.format(10000));

        Locale locale1 = new Locale("en");
        NumberFormat rubFormat1 = NumberFormat.getCurrencyInstance(locale1);
        System.out.println(rubFormat1.format(10000));

        
        Locale locale2 = new Locale("ru", "RU");
        NumberFormat numFormat = NumberFormat.getNumberInstance(locale2);
        Number num = numFormat.parse("10,5");
        System.out.println(num.doubleValue());

        
        Locale locale3 = new Locale("ru");
        Date currentDate = new Date();
        
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale3);
        DateFormat df1=new SimpleDateFormat("dd-MM-yyyy");
      
        System.out.println(df.format(currentDate));
        System.out.println(df1.format(currentDate));

    }

}
