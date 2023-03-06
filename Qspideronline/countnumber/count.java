package Qspideronline.countnumber;

import java.util.Scanner;
class sumcout{
    public static void sumcount(int num)
    {
        int count=0,rem=0,store=0;
        while(num > 0)
        {
           num = num/10;
           ++count;

        }
        System.out.println("number of digit in number is : "+ count);
    }

}
public class count extends sumcout {
        static void sumpower(int temp){
            int rem =0,sum =0;
                while(temp > 0)
                {   rem = temp%10;
                    sum = sum + (rem*rem*rem);
                    temp = temp/10;
                }
            System.out.println("sum of all digit cube in number : "+sum);
        }
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int rem=0, sum=0;
            int temp = num;
            while(num > 0)
            {
                rem = num%10;
                sum = sum + rem;
                num= num/10;
            }
            System.out.println(sum);
            sumcount(temp);
            sumpower(temp);

        }
    }

