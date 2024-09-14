package com.mycompany.oop_constructors;
public class OOP_Constructors {

    public static void main(String[] args) {

        // Instantiate a Stopwatch object
        Stopwatch stopwatch = new Stopwatch();
        
        // Simulate starting the stopwatch
        System.out.println("Starting the stopwatch...");
        stopwatch.start();

        // Simulate the passage of time
        try {
            Thread.sleep(5000);  // Simulating a 5-second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop the stopwatch
        stopwatch.stop();
        System.out.println("Stopping the stopwatch...");
        System.out.println("Elapsed Time: " + stopwatch.getFormattedElapsedTime());

        // Reset the stopwatch
        System.out.println("Resetting the stopwatch...");
        stopwatch.reset();
        System.out.println("Elapsed Time after reset: " + stopwatch.getFormattedElapsedTime());

        // Start and stop the stopwatch again with a different duration
        stopwatch.start();
        try {
            Thread.sleep(3000);  // Simulating a 3-second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stopwatch.stop();
        System.out.println("Elapsed Time after restarting: " + stopwatch.getFormattedElapsedTime());
    
    }
}
