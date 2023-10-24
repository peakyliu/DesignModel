package someSample;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerArrayDemo {
    public static void main(String[] args) {
        int teamValue = 0;
        int[] nums = {1,2,3,4,5,6};
        AtomicIntegerArray i = new AtomicIntegerArray(nums);
        for (int j = 0; j < nums.length; j++) {
            System.out.println(i.get(j));
        }
        teamValue = i.getAndSet(0,2);
        System.out.println("teamValue=" + teamValue + ";此时i:" + i);
        teamValue = i.getAndIncrement(0);
        System.out.println("teamValue=" + teamValue + ";此时i:" + i);
        teamValue = i.getAndAdd(0,5);
        System.out.println("teamValue=" + teamValue + ";此时i:" + i);
    }
}
