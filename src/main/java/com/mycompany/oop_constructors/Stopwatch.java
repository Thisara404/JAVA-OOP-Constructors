package com.mycompany.oop_constructors;

public class Stopwatch {
    private long startTime;
    private long elapsedTime;
    private boolean isRunning;

    public Stopwatch() {
        reset();
    }

    public void start() {
        if (!isRunning) {
            isRunning = true;
            startTime = System.currentTimeMillis();
        }
    }

    public void stop() {
        if (isRunning) {
            long endTime = System.currentTimeMillis();
            elapsedTime += endTime - startTime;
            isRunning = false;
        }
    }

    public void reset() {
        elapsedTime = 0;
        isRunning = false;
    }

    public double getElapsedTime() {
        if (isRunning) {
            long currentTime = System.currentTimeMillis();
            return (elapsedTime + currentTime - startTime) / 1000.0;
        } else {
            return elapsedTime / 1000.0;
        }
    }

    public String getFormattedElapsedTime() {
        double seconds = getElapsedTime();
        int minutes = (int) (seconds / 60);
        int hours = minutes / 60;
        seconds %= 60;
        minutes %= 60;
        return String.format("%02d:%02d:%05.2f", hours, minutes, seconds);
    }
//       public boolean isRunning() {
//        return isRunning;
//    }
}