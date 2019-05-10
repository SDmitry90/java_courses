package by.itacademy.java.dserbunou.classroom.base64sample;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Sample {

    public static void main(String[] args) {
        final String text = "Base 64 finaaly";
        final String encoded = Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
        System.out.println(encoded);

        String decoded = new String(Base64.getDecoder().decode(encoded), StandardCharsets.UTF_8);
        System.out.println(decoded);
    }
}
