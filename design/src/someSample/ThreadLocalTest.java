package someSample;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.List;

public class ThreadLocalTest {
    private ArrayList<String> messages = new ArrayList<String>();
    public static final ThreadLocal<ThreadLocalTest> holder = ThreadLocal.withInitial(ThreadLocalTest::new);

    public static void add(String message){
        holder.get().messages.add(message);
    }

    public static List<String> clear(){
        List<String> messages = holder.get().messages;
        messages.clear();

        System.out.println("size:" + holder.get().messages.size());
        return messages;
    }

    public static void main(String[] args) {
        ThreadLocalTest.add("一枝鲜花");
        System.out.println(holder.get().messages);
        ThreadLocalTest.clear();
    }
}
