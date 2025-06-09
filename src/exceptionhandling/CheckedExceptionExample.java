package exceptionhandling;

import java.io.*;


public class CheckedExceptionExample {
    public static void main(String[] args) throws FileNotFoundException {
        // Attempting to create a FileReader object to read "example.txt"
        FileReader file = new FileReader("example.txt");

    }
}

