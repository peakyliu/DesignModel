package someSample;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AllofDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("future1 is done");
            }
            return "abc";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("future2 is done");
            }
            return "def";
        });

        CompletableFuture<Void> future = CompletableFuture.allOf(future1, future2);
        //这里的join方法是等所有的运行完成之后再执行，不添加的话由于上面线程休眠了，就会先执行下面的了；
        Void result = future.join();
        System.out.println("all future is done");

        CompletableFuture<Object> future3 = CompletableFuture.anyOf(future1, future2);
        System.out.println(future3.get());
    }
}
