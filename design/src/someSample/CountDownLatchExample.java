package someSample;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {
    //请求数量
    private static final int THREAD_COUNT= 500;

    public static void main(String[] args) throws InterruptedException {
        // 创建一个具有固定线程数量的线程池对象（如果这里线程池的线程数量给太少的话你会发现执行的很慢）
        // 只是测试使用，实际场景请手动赋值线程池参数
        ExecutorService threadPool = Executors.newFixedThreadPool(300);
        final CountDownLatch countDownLatch = new CountDownLatch(THREAD_COUNT);
        for (int i = 0; i < THREAD_COUNT; i++) {
            final int threadNum = i;
            threadPool.execute(() -> {
                try {
                    test(threadNum);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    //表示一个请求完成，如果不加的话会造成死锁，因为countDownLatch没有释放
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();
        threadPool.shutdown();
        System.out.println("finish");
    }

    public static void test(int threadNum) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("threadNum" + threadNum + "获得了");
        Thread.sleep(1000);
    }
}
