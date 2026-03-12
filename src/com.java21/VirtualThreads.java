package com.java21;

public class VirtualThreads {
    public static void main(String[] args) throws InterruptedException {
        // Create a virtual thread and print its name from inside the runnable
        Thread virtualThread = Thread.startVirtualThread(() -> {
            System.out.println("Inside runnable: " + Thread.currentThread().getName());
        });

        // Wait for the virtual thread to finish
        virtualThread.join();

        // Print the virtual thread's name from outside (using the Thread object)
        System.out.println("From main (thread object): " + virtualThread.getName());

        // Print the current (main) thread's name to illustrate the difference
        System.out.println("Current thread (main): " + Thread.currentThread().getName());
    }
}
