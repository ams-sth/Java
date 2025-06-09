package collectionsframework;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");

        System.out.println("Fruits inside basket: " + fruits);

        String fruit1 = fruits.getFirst();
        String fruit2 = fruits.get(1);
        System.out.println("First Fruit in the basket: " + fruit1);
        System.out.println("Second book in the basket: " + fruit2);

        for (String name : fruits) {
            System.out.println("Name of the fruit: " + name);
        }

    }
}
