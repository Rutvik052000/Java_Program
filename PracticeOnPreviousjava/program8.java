//write a program to addition of given array element.
package PracticeOnPreviousjava;

import java.util.Scanner;

public class program8 {
    public static void main(String[] args) {
        int arr2[]=new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<=arr2.length-1; i++)
        {
            int input = sc.nextInt();
            arr2[i] = input;
        }
        int add =0;
        for(int i=0; i<=arr2.length-1;i++)
        {
             add = add + arr2[i];
        }
        System.out.println("Addition is : "+add);
    }

}
