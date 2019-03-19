package by.itacademy.java.dserbunou.classroom.lesson10;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.SortedMap;

public class CharsetTest {

    public static void main(String[] args) {
        SortedMap<String, Charset> charsetMap = Charset.availableCharsets();
        System.out.println("Charters available:" + charsetMap.size());
        for (String name : charsetMap.keySet()) {
            Charset charset = charsetMap.get(name);
            StringBuffer sb = new StringBuffer();
            sb.append(name);
            sb.append(" (");
            for (Iterator<String> aliases = charset.aliases().iterator(); aliases.hasNext();) {
                sb.append(aliases.next());
                if (aliases.hasNext()) {
                    sb.append(",");
                }
            }
            sb.append(")");
            System.out.println(sb.toString());
        }
    }

}
