package com.java21;

public class VirtualThreadTaskDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("Main thread: " + Thread.currentThread().getName());

        // Use a virtual-thread-per-task executor to run many short blocking tasks
        try (var executor = java.util.concurrent.Executors.newVirtualThreadPerTaskExecutor()) {
            java.util.List<java.util.concurrent.Future<String>> futures = new java.util.ArrayList<>();

            for (int i = 1; i <= 10; i++) {
                int id = i;
                // Submit a Callable (returns a value)
                futures.add(executor.submit(() -> {
                    String threadName = Thread.currentThread().getName();
                    // Simulate blocking I/O
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    return "Task " + id + " completed on " + threadName;
                }));
            }

            // Collect results
            for (var f : futures) {
                System.out.println(f.get());
            }
        }

        // Create and start a named virtual thread (unstarted builder API)
        Thread v = Thread.ofVirtual().name("my-vt-42").unstarted(() -> {
            // You can get the virtual thread's name from inside the runnable
            System.out.println("Inside named virtual thread: " + Thread.currentThread().getName());
        });

        v.start();
        v.join();

        // You can also read the Thread object's name from outside
        System.out.println("Named virtual thread object name: " + v.getName());

        // Demonstrate Runnable compatibility: virtual threads are Thread instances, not Runnable
        Runnable r = () -> System.out.println("Runnable saw thread: " + Thread.currentThread().getName());
        Thread t = Thread.ofVirtual().name("vrt-from-runnable").start(r);
        t.join();
    }
}

