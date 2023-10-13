package someSample;

import java.security.PublicKey;

public class SynchronizedDemo {
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
