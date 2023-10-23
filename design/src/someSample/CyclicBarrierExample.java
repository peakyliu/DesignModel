package someSample;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.concurrent.*;

public class CyclicBarrierExample {
    private static final int THREAD_COUNT= 500;

    private static final CyclicBarrier cyclicBarrier = new CyclicBarrier(5, () -> {
        System.out.println("当线程到达之后，优先执行");
    });
    public static void main(String[] args) throws InterruptedException {
        //创建线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        for (int i = 0; i < THREAD_COUNT; i++) {
            final int threadNum = i;
            Thread.sleep(1000);
            threadPool.execute(() -> {
                try {
                    test(threadNum);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }catch (BrokenBarrierException e){
                    e.printStackTrace();
                }
            });
        }
        threadPool.shutdown();
    }

    public static void test(int threadNum) throws InterruptedException, BrokenBarrierException{
        System.out.println("threadNum" + threadNum + "is ready");
        try {
            cyclicBarrier.await(60,TimeUnit.SECONDS);
        } catch (Exception e) {
            System.out.println("-----------cyclicBarrierException---------------");
        }
        //当请求数量到达cyclicBarrier设置的5时候，await后面的方法才会被执行
        System.out.println("threadNum" + threadNum + "is finish");
    }
}
