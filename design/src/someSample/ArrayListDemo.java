package someSample;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {
        //ArrayList 是 List 的主要实现类，底层使用 Object[]存储，适用于频繁的查找工作，线程不安全 。
        //Vector 是 List 的古老实现类，底层使用Object[] 存储，线程安全
        //vector之所以是线程安全的，是因为官方在可能涉及到线程不安全的操作都进行了synchronized操作，相当于官方帮你加了一把同步锁
        ArrayList<String> list = new ArrayList<>(Arrays.asList("good", "!", "bye"));
        list.add("fine");
        System.out.println(list);
        list.set(0,"OK");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
