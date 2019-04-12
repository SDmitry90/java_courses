package by.itacademy.java.dserbunou.classroom.i18n;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;

/*Приложение при старте «спрашивает» страну (локаль)
 *и в ответ выводит уровень среднестатистической зарплаты. 
 *Приложение должно быть расширяемым (локализация) путем добавления
 *+1го properties файла без изменений в коде. Цифры не имеют значения, 
 *но должны быть так же конфигурируемы в property файле*/

public class Task {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        File dir = new File("./resources");
        String[] propertyFileNames = dir.list((File d, String name) -> {
            return name.endsWith(".properties");
        });

        StringBuilder sb = new StringBuilder();
        for (String name : propertyFileNames) {
            String subStr = name.substring(name.indexOf("_") + 1, name.indexOf("."));
            sb.append(subStr).append(", ");
        }

        System.out.println("Hello! I know salaries for " + sb.toString().substring(0, sb.toString().length() - 2)
                + ". What is your locale?");

        String str;
        while (!(str = br.readLine()).equals("")) {
            String[] array = str.split("_");
            Locale locale = new Locale(array[0], array[1]);
            ResourceBundle rb = ResourceBundle.getBundle("prop", locale, new UTF8Control());
            System.out.println(rb.getString("message"));
        }

    }

}
