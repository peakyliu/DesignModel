package someSample;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class LinkedHashMapSample {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("a","2");
        hashMap.put("c","3");
        hashMap.put("d","4");
        hashMap.put("e","5");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
