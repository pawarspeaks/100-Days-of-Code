class Counter {
    private int count = 0;

    // Synchronized method to increment count
    public synchronized void increment() {
        count++;
    }

    // Method to get the current count value
    public int getCount() {
        return count;
    }
}

public class BasicThreadSynchronization {
    public static void main(String[] args) {
        // Creating an instance of Counter
        Counter counter = new Counter();

        // Creating and starting two threads that increment count
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                counter.increment();
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
        System.out.println("Final Count: " + counter.getCount());
    }
}
