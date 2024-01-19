import java.util.concurrent.Semaphore;

class SharedResource {
    private int count = 0;
    private Semaphore semaphore = new Semaphore(1);

    public void increment() {
        try {
            semaphore.acquire();
            count++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }

    public int getCount() {
        return count;
    }
}

public class BasicSemaphore {
    public static void main(String[] args) {
        // Creating an instance of SharedResource
        SharedResource sharedResource = new SharedResource();

        // Creating and starting two threads that increment count
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                sharedResource.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                sharedResource.increment();
            }
        });

        thread1.start();
        thread2.start();

        // Waiting for both threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Printing the final count value
        System.out.println("Final Count: " + sharedResource.getCount());
    }
}
