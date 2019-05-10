package by.itacademy.java.dserbunou.classroom.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONSample {

    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Person ben = objectMapper.readValue(new File("example.json"), Person.class);
        System.out.println("deserialization:");
        System.out.println(ben);

        System.out.println("\nserialization");
        objectMapper.writeValue(System.out, ben);

    }

}
