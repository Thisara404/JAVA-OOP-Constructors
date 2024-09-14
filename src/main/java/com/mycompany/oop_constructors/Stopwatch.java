
package com.mycompany.oop_constructors;

public class Stopwatch {
    private long startTime;
    private long elapsedTime;
    private boolean isRunning;

    // Constructor to initialize the stopwatch (default is not running)
    public Stopwatch() {
        this.elapsedTime = 0;
        this.isRunning = false;
    }

    // Method to start the stopwatch
    public void start() {
        if (!isRunning) {
            startTime = System.currentTimeMillis();
            isRunning = true;
        }
    }

    // Method to stop the stopwatch
    public void stop() {
        if (isRunning) {
            elapsedTime += System.currentTimeMillis() - startTime;
            isRunning = false;
        }
    }

    // Method to reset the stopwatch
    public void reset() {
        elapsedTime = 0;
        isRunning = false;
    }

    // Method to get the elapsed time in seconds
    public long getElapsedTime() {
        if (isRunning) {
            return (elapsedTime + (System.currentTimeMillis() - startTime)) / 1000;
        } else {
            return elapsedTime / 1000;
        }
    }

    // Method to format the elapsed time into minutes and seconds
    public String getFormattedElapsedTime() {
        long totalSeconds = getElapsedTime();
        long minutes = totalSeconds / 60;
        long seconds = totalSeconds % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
}
