import java.util.concurrent.*;

class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        // Simulating some time-consuming task
        Thread.sleep(2000);
        return "Callable task completed";
    }
}

public class BasicCallableFuture {
    public static void main(String[] args) {
        // Creating a thread pool with a single thread
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Creating a Callable task
        Callable<String> callable = new MyCallable();

        // Submitting the Callable task to the executor
        Future<String> future = executorService.submit(callable);

        // Performing other tasks while waiting for the Callable task to complete
        System.out.println("Doing other tasks...");

        try {
            // Getting the result of the Callable task (blocking until it completes)
            String result = future.get();
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // Shutting down the executor
            executorService.shutdown();
        }
    }
}
