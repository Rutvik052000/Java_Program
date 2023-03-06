package Qspideronline.armstrongnumber;
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = sc.nextInt();
        System.out.println("Enter a power");
        int n = sc.nextInt();
        double sum =0 , res =0;
        int temp = number;
        while(number>0)
        {
            res = number%2;
            sum = sum + Math.pow(res,n);
            number = number/10;
        }
        if(temp==number)
        {
            System.out.println("Armstrong");
        }else{
            System.out.println("Not armstrong");
        }

    }
}
