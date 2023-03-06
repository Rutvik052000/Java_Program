// initionlization of array 1.Run time 2. compaile time

package PracticeOnPreviousjava;

import java.util.Scanner;

public class program6  {
    public static void main(String[] args) {


        // compaile time intialization
   /* int a[]={10,20,30,40,50}
            //OR
    int a[]=new int[5];
    a[0]=10;
    a[1]=20;
    a[2]=30;
    a[3]=40;
                        */
        // Run time intialization
        int a[] = new int[5];//a[o] = 0..a[4] = 0;

        Scanner obj = new Scanner(System.in);


//        int arr[] = {494, 3243, 23, 2,32,42};

        System.out.println("Enter array element of size 5");
        //taking the ele. from user
        for(int i=0;i< a.length; i++)
        {
            int input = obj.nextInt();
            a[i] = input;
        }

        System.out.println("arr in as it is order");
        //showing as output
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
        System.out.println();

        // print arr element in reverse order.

        //555, 44,33,22,11;
        System.out.println();
        System.out.println("arr in reverse order");
        for (int i = 4; i >= 1 ; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }
}
