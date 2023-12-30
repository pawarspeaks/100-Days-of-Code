import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello");

        future.thenApplyAsync(s -> s + " World")
                .thenAcceptAsync(System.out::println)
                .join();
    }
}
