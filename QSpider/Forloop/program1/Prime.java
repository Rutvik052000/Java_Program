package QSpider.Forloop.program1;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.print("Enter a value do you want to check a prime or not : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // int[] n={34,45,65,76,23,8,32};
        System.out.println(n);

        int flag = 1;
        if(n==0 && n==1)
        {
            System.out.println("If it is not prime number ");
        }
        for(int i=1; i<n; i++)
        {
            if(n%i==0)
            {
                flag= 1;
            }else{
                flag=0;
            }
        }
        if(flag==1)
        {
            System.out.println("It is not prime number");
        }
        else
        {
            System.out.println("It is prime number ");
        }
    }
}
