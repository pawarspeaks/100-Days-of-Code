import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class BasicCompletableFuture {
    public static void main(String[] args) {
        // Creating a CompletableFuture
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            // Simulating some time-consuming task
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "CompletableFuture task completed";
        });

        // Performing other tasks while waiting for the CompletableFuture to complete
        System.out.println("Doing other tasks...");

        try {
            // Getting the result of the CompletableFuture (blocking until it completes)
            String result = completableFuture.get();
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
