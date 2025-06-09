package collectionsframework.tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Set<String> namesCollection = new HashSet<>(Arrays.asList("Ram", "Sam", "Hari", "Gopal", "John"));
        System.out.println("Names added to HashSet: " + namesCollection);

        //Set doesn't allow duplicates. So, Hari will not be displayed twice.
        namesCollection.add("Hari");
        System.out.println("Added new name in HashSet: " + namesCollection);

        namesCollection.remove("Hari");
        System.out.println("Names in HashSet after removal: " + namesCollection);

        if(namesCollection.contains("Hari")) {
            System.out.println("The name" +namesCollection + " wasn't removed before checking.");
        }
        else {
            System.out.println("The name" +namesCollection + " was removed before checking.");
        }
    }
}
