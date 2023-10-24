package someSample;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {
    public static void main(String[] args) {
        int teamValue = 0;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        teamValue = atomicInteger.getAndSet(3);
        System.out.println("teamValue:" + teamValue + ";此时atomicInteger：" + atomicInteger);
        teamValue = atomicInteger.getAndIncrement();
        System.out.println("teamValue:" + teamValue + ";此时atomicInteger：" + atomicInteger);
        teamValue = atomicInteger.getAndAdd(5);
        System.out.println("teamValue:" + teamValue + ";此时atomicInteger：" + atomicInteger);
    }
}
