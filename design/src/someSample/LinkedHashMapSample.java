package someSample;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class LinkedHashMapSample {
    public static void main(String[] args) {
//        HashMap<String, String> hashMap = new HashMap<>();
//        hashMap.put("a","2");
//        hashMap.put("c","3");
//        hashMap.put("d","4");
//        hashMap.put("e","5");
//        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }
        CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<>();
        arrayList.add("java");
        arrayList.add("python");
        arrayList.add("goLong");
        System.out.println("初始列表"+ arrayList);

        System.out.println("列表第二个元素为："+ arrayList.get(1));

        boolean result = arrayList.remove("goLong");
        System.out.println("删除结果为："+ result);
        System.out.println("剩余元素为："+ arrayList);

    }
}
