package Method;
import java.util.Scanner;
public class calculator {
    public static void add()
    {
        System.out.println("Enter a two number ");
        Scanner additon = new Scanner(System.in);
        int a = additon.nextInt();
        int b = additon.nextInt();

        System.out.println("Addition of two number is :"+(a+b));
    }
    public static void sub()
    {
        System.out.println("Enter a two number ");
        Scanner additon = new Scanner(System.in);
        int a = additon.nextInt();
        int b = additon.nextInt();

        System.out.println("Substraction of two number is :"+(a-b));
    }
    public static void mul()
    {
        System.out.println("Enter a two number ");
        Scanner additon = new Scanner(System.in);
        int a = additon.nextInt();
        int b = additon.nextInt();

        System.out.println("Multiplication of two number is :"+(a*b));
    }
    public static void div()
    {
        System.out.println("Enter a two number ");
        Scanner additon = new Scanner(System.in);
        int a = additon.nextInt();
        int b = additon.nextInt();

        System.out.println("Division of two number is :"+(a/b));
    }
    public static void rem()
    {
        System.out.println("Enter a two number ");
        Scanner additon = new Scanner(System.in);
        int a = additon.nextInt();
        int b = additon.nextInt();

        System.out.println("Reminder of two number is :"+(a%b));
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Press following bottons" + "\n Addition : 1" + "\n Substraction : 2"+"\n Multiplication : 3" + "\n Divisoin : 4" + "\n Remainder : 5");
        Scanner op = new Scanner(System.in);
        n = op.nextInt();
        switch(n)
        {
            case 1 :
                    add();
                    break;
            case 2 :
                    sub();
                    break;
            case 3 :
                    mul();
                    break;
            case 4 :
                    div();
                    break;
            case 5 :
                    rem();
                    break;

        }
    }
}
