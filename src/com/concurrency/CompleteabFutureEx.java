package src.com.concurrency;

import java.util.concurrent.*;

public class CompleteabFutureEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // ===== FUTURE EXAMPLE =====
        System.out.println("=== Future Example ===");
        futureExample();

        // ===== COMPLETABLE FUTURE EXAMPLE =====
        System.out.println("\n=== CompletableFuture Example ===");
        completableFutureExample();
    }

    // Example 1: Using Future
    static void futureExample() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Submit a task that returns a value
        Future<Integer> future = executorService.submit(() -> {
            System.out.println("Task 1: Computing result...");
            Thread.sleep(2000); // Simulate long operation
            return 10 + 20;
        });

        // Blocking call - waits for result
        int result = future.get();
        System.out.println("Future Result: " + result);

        // Check if task is done
        System.out.println("Is Done: " + future.isDone());

        executorService.shutdown();
    }

    // Example 2: Using CompletableFuture (Modern approach - Java 8+)
    static void completableFutureExample() throws ExecutionException, InterruptedException {

        // 1. supplyAsync - Returns a value
        CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Task 1: Computing number...");
            return 50;
        });

        // 2. Chain operations with thenApply
        CompletableFuture<Integer> cf2 = cf1.thenApply(num -> {
            System.out.println("Task 2: Doubling " + num);
            return num * 2;
        });

        // 3. Chain more operations
        CompletableFuture<String> cf3 = cf2.thenApply(num -> {
            System.out.println("Task 3: Converting to String");
            return "Result: " + num;
        });

        // Get final result (blocking)
        String finalResult = cf3.get();
        System.out.println("CompletableFuture Result: " + finalResult);

        // ===== Non-blocking approach =====
        System.out.println("\n=== Non-blocking CompletableFuture ===");
        CompletableFuture<Integer> cf4 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 100;
        });

        // Non-blocking callback
        cf4.thenAccept(result -> System.out.println("Callback received: " + result));

        // Wait for async operation to complete
        Thread.sleep(2000);

        // ===== Combining multiple CompletableFutures =====
        System.out.println("\n=== Combining Multiple CompletableFutures ===");
        CompletableFuture<Integer> cf5 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Fetching user ID...");
            return 1;
        });

        CompletableFuture<String> cf6 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Fetching user name...");
            return "John";
        });

        // Combine results
        CompletableFuture<String> combined = cf5.thenCombine(cf6, (id, name) -> {
            return "ID: " + id + ", Name: " + name;
        });

        System.out.println("Combined Result: " + combined.get());
    }
}
