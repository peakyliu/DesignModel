package someSample;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceDemo {
    public static void main(String[] args) {
        AtomicReference<PersonTest> ato = new AtomicReference<>();
        PersonTest person = new PersonTest("zhangsan", 22);
        ato.set(person);
        PersonTest updatePerson = new PersonTest("peaky", 20);
        ato.compareAndSet(person,updatePerson);
        System.out.println(ato.get().getName());
        System.out.println(ato.get().getAge());
    }
}
class PersonTest{
    private String name;
    private int age;

    public PersonTest(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
