import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Synchronized = concurrent safe. Speedup execution with multithreading
        ConcurrentHashMap<String, Integer> concurrentMap =
                                new ConcurrentHashMap<>();

        Thread t1 = new Thread(() -> {
            concurrentMap.put("one", 1);
        });

        Thread t2 = new Thread(() -> {
            concurrentMap.put("one", 9);
        });

        t1.start();
        t2.start();

        t1.join(); // Wait
        t2.join();
        System.out.println(concurrentMap);
    }


    //Not synchronized = normal ArrayList, normal HashMap
}
