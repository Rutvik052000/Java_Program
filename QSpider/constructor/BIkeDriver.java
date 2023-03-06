package QSpider.constructor;
import java.util.Scanner;
class bike
{
    int cc;
    {
        String country = "India";
        System.out.println(country);
        System.out.println("Which type of bike do you like most");
    }
    bike()
    {
        Scanner sc = new Scanner(System.in);
        int cc = sc.nextInt();
        System.out.println("HERO HONDA");
        System.out.println("Spender");
    }

}

public class BIkeDriver {
    public static void main(String [] args)
    {
        bike b1= new bike();

    }

}
