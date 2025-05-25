package arrays;

import java.util.Arrays;

public class AddElementsMethod {
    private int[] arr = new int[0];

    public int[] addElement(int ele) {
        int[] newArr = new int[arr.length + 1];

/*      for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];  // Copy old values
        }
*/
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = ele; // Add new element at the end
        arr = newArr; // Update the array
        return arr;
    }

    public static void main(String[] args) {
        AddElementsMethod aem = new AddElementsMethod();
        System.out.println("Adding element : " + Arrays.toString(aem.addElement(1)));
        System.out.println("Adding element : " + Arrays.toString(aem.addElement(2)));
        System.out.println("Adding element : " + Arrays.toString(aem.addElement(3)));
        System.out.println("Adding element : " + Arrays.toString(aem.addElement(4)));

    }
}
