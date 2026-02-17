package com.java21;

public class Java21Features {
    public static void main(String[] args) throws Exception {
        // Create a virtual thread with a name
        Thread v = Thread.ofVirtual().name("my-virtual-thread-1").unstarted(() -> {
            System.out.println("Running in: " + Thread.currentThread().getName());
        });

        // Start the virtual thread
        v.start();
        v.join();

        // Use Thread.ofVirtual().start() convenience which returns the started thread
        Thread started = Thread.ofVirtual().start(() -> {
            System.out.println("Started virtual: " + Thread.currentThread().getName());
        });
        started.join();

        // Demonstrate Runnable compatibility
        Runnable r = () -> System.out.println("Runnable executed on: " + Thread.currentThread().getName());
        Thread t = Thread.ofVirtual().name("vrt-2").start(r);
        t.join();
    }
}

