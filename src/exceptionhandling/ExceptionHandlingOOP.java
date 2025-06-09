package exceptionhandling;

public class ExceptionHandlingOOP {
    public void errorhandling() {
        try {
            int number = 10;
            int divider = 0;

            // Valid statement, no exception occurs
            System.out.println("Outcome: " + number);

            // Attempting to divide by zero, which throws an ArithmeticException
            System.out.println("Outcome: " + number / divider);

        } catch (ArithmeticException error) {
            // Handle the exception and provide a clear error message
            System.out.println("Error: Division by zero occurred. Details: " + error.getMessage());
        } finally {
            // Always runs, even if an exception occurs
            System.out.println("Execution finished. Cleaning up...");
        }
    }

    public static void main(String[] args) {
        var exceptionHandlingOOP = new ExceptionHandlingOOP();
        exceptionHandlingOOP.errorhandling();

    }
}

