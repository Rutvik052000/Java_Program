//find the smallest element in an array

package StriverTCS.smallestElement;

import java.util.Arrays;

public class smallele {
    public static void main(String [] args) {
        int ans = small();
        System.out.println(ans);

        int arr[] = {2, 5, 1, 3, 0};
        int small = -1;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 1; j <= arr.length -1; j++) {
                if (arr[i] < arr[j]) {
                    small = arr[i];
                }
            }
        }
        System.out.println("Smallest element of array is :" +small);
    }


    //method 2

    public static int small(){
        int small = -1;
        int arr[] = {1, 2, 34, 4, 5,4 ,3,3, 24, 42432};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            if (small > arr[i]){
                small = arr[i];
            }
        }
        return small;
    }
}
