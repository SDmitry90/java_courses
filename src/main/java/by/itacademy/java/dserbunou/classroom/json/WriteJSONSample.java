package by.itacademy.java.dserbunou.classroom.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJSONSample {

    public static void main(String[] args) {
        JSONObject sampleObject = new JSONObject();
        sampleObject.put("name", "Stackabuser");
        sampleObject.put("age", 35);

        JSONArray messages = new JSONArray();
        messages.add("Hay!");
        messages.add("What's up?");

        sampleObject.put("messages", messages);
        System.out.println(sampleObject.toJSONString());

    }
}
