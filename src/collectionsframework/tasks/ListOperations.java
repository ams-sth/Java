package collectionsframework.tasks;

import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;

public class ListOperations {

    public static void main(String[] args) {
        // Initialize the list with values
        List<Integer> numbersCollection = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        System.out.println("Elements inside ArrayList: " + numbersCollection);

        numbersCollection.remove(2); // Removes the element at index 2
        System.out.println("Elements inside ArrayList after removing 3rd element: " + numbersCollection);

        numbersCollection.set(1, 3); // Updates the element at index 1
        System.out.println("Elements inside ArrayList after replacing 2nd element with new value: " + numbersCollection);

        // Check if a specific value exists in the list
        int valueToCheck = 2;
        if (numbersCollection.contains(valueToCheck)) {
            System.out.println("The value " + valueToCheck + " exists in the list.");
        } else {
            System.out.println("The value " + valueToCheck + " does not exist in the list.");
        }
    }
}
