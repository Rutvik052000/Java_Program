// Find a largest element in java
package StriverTCS.smallestElement.program2;

import java.util.Arrays;

public class largeele {

    public static void large()
    {
        int arr1[] = {8,10,5,7,9};
        int large = 0;
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1[4]);
    }

    public static void main(String [] args)
    {
        int arr[] = {2, 5, 1, 3, 0};
        int large = 0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[4]);
        large();


    }
}
