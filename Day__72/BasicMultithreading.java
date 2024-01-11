public class BasicMultithreading {
    public static void main(String[] args) {
        // Creating and starting a new thread
        Thread myThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread: " + Thread.currentThread().getId() + " - Count: " + i);
                try {
                    Thread.sleep(500); // Simulating some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        myThread.start(); // Starting the thread

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
