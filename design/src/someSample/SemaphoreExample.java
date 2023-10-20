package someSample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    //创建请求数量，初始为500
    private static final int threadCount = 500;

    public static void main(String[] args) {
        //创建一个具有固定线程池数量的对象
        ExecutorService threadPool = Executors.newFixedThreadPool(300);
        //初始许可证数量
        Semaphore semaphore = new Semaphore(20);
        for (int i = 0; i < threadCount; i++) {
            final int threadNum = i;
            threadPool.execute(() -> {
                try {
                    semaphore.acquire();
                    test(threadNum);
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        threadPool.shutdown();
        System.out.println("finish");
    }

    public static void test(int threadCount) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("threadNum"+ threadCount);
        Thread.sleep(1000);
    }
}
