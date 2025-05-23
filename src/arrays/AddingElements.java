package arrays;

import java.util.Arrays;

public class AddingElements {
    public int[] arr;
    public static void main(String[] args) {
        var elements = new AddingElements();
        elements.arr = new int[2];
        System.out.println("Before adding elements: " + Arrays.toString(elements.arr));
        elements.arr[0] = 1;
        elements.arr[1] = 2;
        System.out.println("Adding element in first index: " + elements.arr[0]);
        System.out.println("Adding element in second index: " + elements.arr[1]);
        System.out.println("After adding elements: " + Arrays.toString(elements.arr));
    }
}

/*
        int [] arr = new int[2]; declares the size of an array.
        It indicates the amount of elements that can fit inside array.
        arr[0] and arr[1] indicates first and second indexes of array.
*/
