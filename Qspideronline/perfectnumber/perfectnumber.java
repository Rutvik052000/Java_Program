package Qspideronline.perfectnumber;

import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = sc.nextInt();
        int sum =1;
        for( int i=2; i<= number/2; i++)
        {
            if(number%2==0)
            {
                sum = sum + i;

            }
        }if(sum==number)
        {
            System.out.println("Yes it is a perfect number");
        }else{
            System.out.println("It is not a perfect number");
        }
    }
}
