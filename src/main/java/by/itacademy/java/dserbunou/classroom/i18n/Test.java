package by.itacademy.java.dserbunou.classroom.i18n;

import java.util.Locale;

public class Test {

    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        
        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());
        System.out.println(locale.getDisplayName());
    }
}
