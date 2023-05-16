package someSample;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("good", "!", "bye"));
        list.add("fine");
        System.out.println(list);
        list.set(0,"OK");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
