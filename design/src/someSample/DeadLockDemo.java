package someSample;

public class DeadLockDemo {
    private static Object demo1 = new Object();
    private static Object demo2 = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (demo1){
                System.out.println(Thread.currentThread().getName() + "get demo1");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "waiting get demo2");
                synchronized (demo2){
                    System.out.println(Thread.currentThread().getName() + "get demo2");
                }
            }
        },"thread1").start();

        new Thread(() -> {
            synchronized (demo2){
                System.out.println(Thread.currentThread().getName() + "get demo2");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "waiting get demo1");
                synchronized (demo1){
                    System.out.println(Thread.currentThread().getName() +"get demo1");
                }
            }
        },"thread2").start();
    }
}
