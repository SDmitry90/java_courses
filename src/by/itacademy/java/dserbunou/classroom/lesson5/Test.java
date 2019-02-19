package by.itacademy.java.dserbunou.classroom.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) throws MalformedURLException, ProtocolException, IOException {
        /*
         * String str = "я изучаю Java "; StringBuilder strBuilder = new
         * StringBuilder(str); strBuilder.append("и английский тоже нужен");
         * System.out.println(strBuilder.toString());
         */
        // System.out.println("20934".matches("-?[0-9]+"));

        /*
         * String str = "Test      string for split"; String[] words = str.split(" +");
         * //разбить строку по пробелу от одного и больше, если без плюса, то по каждому
         * пробелу for (String word : words) { System.out.println(word + ""); }
         */

        /*
         * String str = "Test    multiple    spaces";
         * System.out.println(str.replaceAll(" +", " ")); //в местах, там, где один или
         * более пробела, заменить на один пробел
         */

        /*
         * final BufferedReader bufferedReader = new BufferedReader(new
         * InputStreamReader(System.in)); String str="";
         * 
         * System.out.printf("Введите строку:\n", str); String str =
         * Integer.parse(bufferedReader.readLine());
         */

        /*
         * try (Scanner sc = new Scanner(System.in)) { String line = sc.nextLine();
         * String result = "String contains various characters"; String numRegex =
         * "\\d+"; String wordRegex = "(?i)[a-z]+"; if (line.matches(numRegex)) { result
         * = "String contains only numbers"; } else if (line.matches(wordRegex)) {
         * result = "String contains only letters"; } System.out.println(result); }
         */

        /*
         * Pattern p = Pattern.compile(" +- +"); Matcher matcher =
         * p.matcher("Test - string - test"); while (matcher.find()) {
         * System.out.println(matcher.start() + " " + matcher.end());
         * 
         * }
         */

    }

}
