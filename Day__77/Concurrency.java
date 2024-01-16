public class BasicConcurrency {
    public static void main(String[] args) {
        // Creating and starting two threads
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1 - Count: " + i);
                try {
                    Thread.sleep(500); // Simulating some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2 - Count: " + i);
                try {
                    Thread.sleep(500); // Simulating some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start(); // Starting the first thread
        thread2.start(); // Starting the second thread

        // Main thread continues to execute
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread - Count: " + i);
            try {
                Thread.sleep(500); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
