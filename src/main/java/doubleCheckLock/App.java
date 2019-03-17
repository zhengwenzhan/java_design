package doubleCheckLock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhengwenzhan on 2019-03-17
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        Inventory inventory = new Inventory(1000);
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        long start = System.currentTimeMillis();

        //开五个线程
        for (int i = 0; i < 5; i++) {
            executorService.execute(() -> {
                while (inventory.addItem(new Item())) {
                }
            });
        }

        long end = System.currentTimeMillis();

        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println(end - start);

    }
}
