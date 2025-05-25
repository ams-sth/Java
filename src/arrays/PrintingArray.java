package arrays;

import java.util.Arrays;

public class PrintingArray {
    public int[] arr;

    public static void main(String[] args) {
        PrintingArray array = new PrintingArray();
        array.arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array.arr));
    }
}

/*
Note-1:
      int [] arr = {1,2,3,4,5} is shorthand for int [] arr = new int[]{1,2,3,4,5}.
      It can only be used for array declaration and initialization at the same line.
      eg: int [] arr = {1,2,3,4,5} is correct.
      However,
             int[] arr;
             arr = {1,2,3,4,5} is incorrect.
             arr = new int[] {1,2,3,4,5} is the correct version.

Note-2:
      Arrays.toString is necessary to print the array itself.
*/

