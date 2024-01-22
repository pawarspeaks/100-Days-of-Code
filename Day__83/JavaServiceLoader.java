interface MyService {
    void performService();
}

class MyServiceImpl1 implements MyService {
    @Override
    public void performService() {
        System.out.println("Service Implementation 1");
    }
}

class MyServiceImpl2 implements MyService {
    @Override
    public void performService() {
        System.out.println("Service Implementation 2");
    }
}

public class BasicJavaServiceLoader {
    public static void main(String[] args) {
        // Using ServiceLoader to load implementations of MyService
        ServiceLoader<MyService> serviceLoader = ServiceLoader.load(MyService.class);

        // Iterating over loaded services and invoking the performService method
        for (MyService myService : serviceLoader) {
            myService.performService();
        }
    }
}
