// write a program to no. is paliamdrom or not by single lavel inheritance

package PracticeOnPreviousjava;

import java.util.Scanner;

class palimdrom{
    void pali1(int a)
        {
            int res = 0;
            int b = a;
            while(a >0) {

                int input = a % 10;
                res = res * 10 + input;
                a = a / 10;
            }
            if(b==res)
            {
                System.out.println("Number is palimdrom : " + res);
            }else{
                System.out.println("Number is not palimdrom "+ res);
            }

        }
}
class prime extends palimdrom{
    void pali2(int c)
    {
        int flag = 0;
        if(c==0 || c==1)
        {
            System.out.println("No is not prime ");
        }
        for(int i=2 ; i<c ; i++)
        {
            if(c%i==0)
            {
                System.out.println("Number is not prime : "+c);
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Number is prime : "+c);
        }

    }
}

public class program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //int d = sc.nextInt();
        prime obj = new prime();
        obj.pali1(a);
        obj.pali2(a);

    }
}
