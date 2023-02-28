package HomeWork12;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class HomeWork12 {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        executorService.scheduleAtFixedRate(
                () -> System.out.println("Time: " + new Date()),
                0,
                1,
                TimeUnit.SECONDS
        );
        executorService.scheduleAtFixedRate(
                () -> System.out.println("Минуло 5 секунд"),
                5,
                5,
                TimeUnit.SECONDS
        );
        Thread.sleep(10000);
        executorService.shutdown();
        System.out.println("Other action");

    }

    public static class MyTask implements Runnable {

        @Override
        public void run() {
            System.out.println("Time: " + System.currentTimeMillis());

        }
    }
}
