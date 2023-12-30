import java.util.concurrent.*;
import java.util.concurrent.Flow.*;

public class JavaFlowAPIAdvancedDemo {
    public static void main(String[] args) throws InterruptedException {
        SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>();
        Subscriber<Integer> subscriber = new MySubscriber();

        publisher.subscribe(subscriber);

        System.out.println("Publishing items...");
        for (int i = 0; i < 5; i++) {
            publisher.submit(i);
        }

        Thread.sleep(1000);
        publisher.close();
    }

    static class MySubscriber implements Subscriber<Integer> {
        private Subscription subscription;

        @Override
        public void onSubscribe(Subscription subscription) {
            this.subscription = subscription;
            subscription.request(1);
        }

        @Override
        public void onNext(Integer item) {
            System.out.println("Received: " + item);
            subscription.request(1);
        }

        @Override
        public void onError(Throwable throwable) {
            throwable.printStackTrace();
        }

        @Override
        public void onComplete() {
            System.out.println("Done!");
        }
    }
}
