package someSample;

import java.sql.SQLOutput;
import java.util.Currency;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertEquals;

public class AcceptEitherDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //这里是acceptEitherAsync方法的使用
        CompletableFuture<String> task =CompletableFuture.supplyAsync(()->{
            System.out.println("任务1开始执行时间为："+System.currentTimeMillis());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            System.out.println("任务1结束时间为：" + System.currentTimeMillis());
            return "task1";
        });

        CompletableFuture<String> task2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("任务2开始执行时间为：" + System.currentTimeMillis());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("任务2结束时间为：" + System.currentTimeMillis());
            return "task2";
        });

        task.acceptEitherAsync(task2,(res)->{
            System.out.println("任务3开始执行时间为：" + System.currentTimeMillis());
            System.out.println("任务3结束时间为：" + System.currentTimeMillis());
        });

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //这里是thenCompose和thenCombine的使用
        CompletableFuture<String> future
                = CompletableFuture.supplyAsync(() -> "hello!")
                .thenCompose(s -> CompletableFuture.supplyAsync(() -> s + "world!"));
        assertEquals("hello!world!", future.get());

        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> "hello!")
                .thenCombine(CompletableFuture.supplyAsync(
                        () -> "world!"), (s1, s2) -> s1 + s2)
                .thenCompose(s -> CompletableFuture.supplyAsync(() -> s + "nice!"));
        assertEquals("hello!world!nice!", completableFuture.get());

    }
}
