package PracticeOnPreviousjava;

import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
      /*  // Intilization and declaration of two dimensional array(compaile time intialization)
        int a[][] = {{21,34,45},{23,43,32}};
                    //OR
        int [][]b = {{21,34,45},{23,43,32}};
                    //OR
        int c[][] = new int [2][2];
        c[0][0] = 21;
        c[0][1] = 34;
        c[1][0] = 23;
        c[1][1] = 43;           */


        Scanner sc =new Scanner(System.in);
        // run time intialization;

        //take the input fform user.
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        int a[][] = new int[input1][input2];

        for(int i=0 ; i< a.length ; i++)
        {
            for(int j=0; j < a[i].length; j++)
            {
                // a = { {345,2,423},
                //       {43,32},
                //      {43, 45,35,453,543}}
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i< a.length; i++)
        {
            for(int j=0; j< a[i].length ; j++)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }


        //predefined arr, taken input from user
//        int arr3[][] = {{35,353,34,345,6,4},
//                {4352,23423,24234,242,24232,4224,4242},
//                {35,345,435,453},
//                {53,35,35,543,3453,35,45,53,543}};
//
//        for (int i = 0; i < arr3.length; i++) {
//            for (int j = 0; j < arr3[i].length ; j++) {
//                System.out.print(arr3[i][j]+ " ");
//            }
//            System.out.println();
//        }


    }
}
