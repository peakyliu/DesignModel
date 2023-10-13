package someSample;

import java.security.PublicKey;

public class SynchronizedDemo {
    //由于这里synchronized是可重入锁，方法1已经获取了对象锁，所以再次获取方法2的时候不会产生死锁的问题
    public static void main(String[] args) {
        SynchronizedDemo synchronizedDemo = new SynchronizedDemo();
        synchronizedDemo.method1();
    }
    public synchronized void method1(){
        System.out.println("方法1");
        method2();
    }
    public synchronized void method2(){
        System.out.println("方法2");
    }
}
