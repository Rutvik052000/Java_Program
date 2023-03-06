// addition of natural number by using recursion function

package PracticeOnPreviousjava;
import java.util.Scanner;
public class program4 {
    public int add(int n)
    {
        if(n==1){
            return 1;
        }else{

        return n+add(n-1);
        }
    }

    public static void main(String[] args) {

        //System.out.println("Enter number you addition want : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter number you addition want : "+n);

       program4 obj = new program4();
       int addition = obj.add(n);
        System.out.println("addition of number is :"+addition);


    }
}

