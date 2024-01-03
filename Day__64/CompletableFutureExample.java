import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello");

        future.thenApplyAsync(result -> result + " World")
                .thenAcceptAsync(System.out::println)
                .thenRun(() -> System.out.println("CompletableFuture example executed successfully"))
                .exceptionally(ex -> {
                    System.out.println("Exception occurred: " + ex.getMessage());
                    return null;
                });

        try {
            future.get(); // Waiting for the CompletableFuture to complete
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
