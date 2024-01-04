import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class ReactiveProgrammingWithRxJava {
    public static void main(String[] args) throws InterruptedException {
        Observable.range(1, 5)
                .observeOn(Schedulers.io())
                .map(number -> number * number)
                .subscribe(result -> System.out.println("Result: " + result));

        // Adding a delay to keep the main thread alive
        Thread.sleep(1000);
    }
}
