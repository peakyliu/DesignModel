package someSample;

import java.util.Comparator;
import java.util.TreeMap;

public class Person {
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person(Integer age) {
        this.age = age;
    }

    public static void main(String[] args) {
        TreeMap<Person, Object> map = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int num = o1.age - o2.age;
                return Integer.compare(num, 0);
            }
        });

        map.put(new Person(3),"person1");
        map.put(new Person(4),"person2");
        map.put(new Person(6),"person3");
        map.put(new Person(7),"person4");

        map.entrySet().stream().forEach(personStringEntry -> {
            System.out.println(personStringEntry.getValue());
        });
    }
}
