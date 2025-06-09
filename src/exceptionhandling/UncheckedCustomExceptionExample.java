package exceptionhandling;

// Define a custom unchecked exception
class NegativeNumberException extends RuntimeException {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class UncheckedCustomExceptionExample {
    public static void checkPositiveNumber(int number) {
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed.");
        } else {
            System.out.println("Number is positive.");
        }
    }

    public static void main(String[] args) {
        try {
            checkPositiveNumber(-5); // This will throw a NegativeNumberException
        } catch (NegativeNumberException e) {
            System.out.println("Caught an unchecked exception: " + e.getMessage());
        }
    }
}
