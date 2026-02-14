package main.java.singleton;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private static Logger instance;
    private BufferedWriter writer;
    private String currentFile = "default.log";

    // Private constructor (Singleton)
    private Logger() {
        openFile(currentFile);
    }

    // Get the single instance
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Open a file for writing
    private void openFile(String filename) {
        try {
            writer = new BufferedWriter(new FileWriter(filename, true));
        } catch (IOException e) {
            System.out.println("Error opening log file: " + e.getMessage());
        }
    }

    // Change log file
    public synchronized void setFileName(String filename) {
        try {
            if (writer != null) {
                writer.close();
            }
            currentFile = filename;
            openFile(filename);
        } catch (IOException e) {
            System.out.println("Error switching log file: " + e.getMessage());
        }
    }

    // Write a log message
    public synchronized void write(String message) {
        try {
            writer.write(message);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            System.out.println("Error writing log: " + e.getMessage());
        }
    }

    // Close file
    public synchronized void close() {
        try {
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            System.out.println("Error closing log file: " + e.getMessage());
        }
    }

}


