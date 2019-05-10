package by.itacademy.java.dserbunou.home.practice5.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Test {
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
        String text = readFromUrl("https://www.sample-videos.com/text/Sample-text-file-10kb.txt");
        text = text.replaceAll("[,.]", "");
        // System.out.println(text);
        Map<String, Integer> strMap = new HashMap<>();

        putInMap(text.split(" "), strMap);
        System.out.println(strMap.toString());

    }

    public static void putInMap(String[] arr, Map<String, Integer> map) {
        for (String word : arr) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
    }
}
