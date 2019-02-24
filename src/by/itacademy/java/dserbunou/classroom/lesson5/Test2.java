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

public class Test2 {

    private static String readFromUrl(final String url) throws MalformedURLException, IOException, ProtocolException {
        final URL obj = new URL(url);
        final HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

        connection.setRequestMethod("GET");
        String htmlString = null;
        try (final BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));) {
            String inputLine;
            final StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
                htmlString = response.toString();
            }
        }
        return htmlString;
    }

    public static void main(String[] args) throws MalformedURLException, ProtocolException, IOException {
      
        String text = readFromUrl("https://www.tut.by");
        int counter = 0;
        Pattern pattern = Pattern.compile("<div[^>]*>");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            counter++;
        }
        System.out.printf("Found %d <div> open tags", counter);

    }

}
