// factorial give no by resursive fuction.

package PracticeOnPreviousjava;

import java.util.Scanner;

public class Program2 {
    int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }else
            return n*fact(n-1);

    }

    public static void main(String[] args) {
        int n;
        Scanner fa = new Scanner(System.in);
         n =fa.nextInt();
         Program2 obj = new Program2();
         int f = obj.fact(n);
        System.out.println(f);



    }
}
