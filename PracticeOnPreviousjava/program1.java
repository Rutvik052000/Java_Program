package PracticeOnPreviousjava;

import java.util.Scanner;

public class program1 {
    void fact(int m)
    {
        int f=1;
        for(int i=1; i<=m ; i++)
        {
            f=f*i;
        }
        System.out.println("Factorial of "+f);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        program1 f1 = new program1();
        f1.fact(n);
    }
}
