//write a program to print "Hello" word in reverse

package QSpider.Array.palindrom;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args)
    {
        System.out.print("Write a word do you want to check is palidrom or not : ");
        Scanner sc =new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        String reverse = "";
        for(int i=name.length()-1;i>=0;i--)
        {
            reverse += name.charAt(i);
        }
        System.out.println(reverse);
        if(reverse==name)
        {
            System.out.println("It is palindrom");
        }else
        {
            System.out.println("It is not palindrom");
        }
    }

}
