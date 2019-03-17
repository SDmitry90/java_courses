package by.itacademy.java.dserbunou.home.practice5.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		System.out.println(text);
		Set<String> str=new HashSet<String>();
		
		
		Pattern pattern = Pattern.compile("(?i)\\b(\\w+)(?:\\s+\\1\\b)+");
		Matcher matcher = pattern.matcher(text);
		System.out.println();

	}

}
