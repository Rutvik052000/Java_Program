package PracticeOnPreviousjava;

import java.util.Scanner;

public class progam11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 =sc.nextInt();
        int arr3[][] = new int[input1][input2];
        for(int i=0; i<= arr3.length-1 ;i++)
        {
            for(int j=0; j <= arr3[i].length-1; j++)
            {
                arr3[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<=arr3.length-1; i++)
        {
            for(int j=0; j<= arr3[i].length-1;j++)
            {
                System.out.print(arr3[i][j]+ " ");
            }
            System.out.println();
        }
    }




}
