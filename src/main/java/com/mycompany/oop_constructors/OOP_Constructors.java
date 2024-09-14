package com.mycompany.oop_constructors;
import java.util.Scanner;

public class OOP_Constructors {

    public static void main(String[] args) {

       Stopwatch stopwatch = new Stopwatch();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Stopwatch Program");
        System.out.println("Commands: start, stop, reset, elapsed, quit");

        while (true) {
            System.out.print("Enter command: ");
            input = scanner.nextLine().toLowerCase();

            switch (input) {
                case "start":
                    stopwatch.start();
                    System.out.println("Stopwatch started and Running......"
                            + "\n ' if you want to stop Enter the Command ' ");
                    break;
                case "stop":
                    stopwatch.stop();
                    System.out.println("Stopwatch stopped.");
                    break;
                case "reset":
                    stopwatch.reset();
                    System.out.println("Stopwatch reset.");
                    break;
                case "elapsed":
                    System.out.printf("Elapsed time: %.2f seconds\n", stopwatch.getElapsedTime());
                    System.out.println("Formatted time: " + stopwatch.getFormattedElapsedTime());
                    break;
                case "quit":
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
        
    }
}
