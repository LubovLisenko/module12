package HomeWork12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class HomeWorkFizzBuzz {
    public static volatile AtomicInteger number = new AtomicInteger(20);
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(5);
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        service.submit(fizzBuzzService::fizz);
        service.submit(fizzBuzzService::buzz);
        service.submit(fizzBuzzService::fizzbuzz);
        service.submit(fizzBuzzService::number);
        service.submit(fizzBuzzService::print);
    }
}
