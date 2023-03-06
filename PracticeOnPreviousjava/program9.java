// write a program to find minimum element in array

package PracticeOnPreviousjava;

import java.util.Scanner;

public class program9 {
    public static void main(String[] args) {
        int arr2[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= arr2.length - 1; i++) {
            int input = sc.nextInt();
            arr2[i] = input;
        }
        for(int i=0; i<= arr2.length-1;i++)
        {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        int add = 0;
        int min = arr2[0];
        for (int i = 0; i <= arr2.length - 1; i++) {
            if (arr2[i] < min) {
                min = arr2[i];
                i++;
            }
        }
        System.out.println("Minimum element is : " + min);
    }
}
