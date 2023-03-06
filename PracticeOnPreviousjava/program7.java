// write a program to print given array element
// Defination of array
// array is the container of object to hole fixed number of single data type
package PracticeOnPreviousjava;

import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
      /*  String arr[]= new String[5];
        Scanner obj = new Scanner(System.in);

        for(int i=0; i<= arr.length-1; i++)
        {
            String input = obj.nextLine();
            arr[i] = input;
        }
        for(int i=0; i<= arr.length-1;i++)
        {
            System.out.print(arr[i] + " ");
        }                                           */

        int arr1[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<=arr1.length-1; i++)
        {
            int input = sc.nextInt();
            arr1[i]=input;
        }
        for(int i=0; i<=arr1.length-1;i++)
        {
            System.out.print(arr1[i] + " ");
        }

    }
}

