package exceptionhandling;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        // This will throw ArrayIndexOutOfBoundsException
        System.out.println(arr[5]);
    }
}

