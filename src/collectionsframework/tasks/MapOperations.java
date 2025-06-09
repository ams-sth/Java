package collectionsframework.tasks;

import java.util.*;

public class MapOperations {
    public static void main(String[] args) {
        /* Map is collection of elements  as key value pair.
           The first and second type parameter indicates Key and Value respectively.
        */
        Map<String, List<String>> dynamicColl = new LinkedHashMap<>();
        dynamicColl.put("Student ID", new ArrayList<>(Arrays.asList("John", "Jane")));
        dynamicColl.get("Student ID").add("Josh");
        dynamicColl.get("Student ID").add("June");
        dynamicColl.get("Student ID").add("John"); // Keys should be unique whereas values can be duplicated

        System.out.println("Name added based on key-value pair: " + dynamicColl );

        dynamicColl.get("Student ID").set(4, "Jamie");
        System.out.println("Student ID updated: " + dynamicColl);

        dynamicColl.get("Student ID").remove(4);
        System.out.println("Removed Student ID" + dynamicColl);

    }
}
