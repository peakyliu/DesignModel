package someSample;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompletableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //thenApply的用法就是接受一个function实例，用它来处理结果
        CompletableFuture.completedFuture("hello!").thenApply(s -> s + "world!").thenApply(s -> s + "nice!").thenAccept(System.out::println);
//        CompletableFuture<String> future = CompletableFuture.completedFuture("hello!").thenApply(s -> s + "world!").thenApply(s -> s + "nice!");
//        assertEquals("hello!world!nice!", future.get());
//        future.thenApply(s -> s + "nice!");
//        assertEquals("hello!world!nice!",future.get());
    }

}
