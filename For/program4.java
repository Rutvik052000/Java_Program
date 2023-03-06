// write a program to print given prime number or not.

package For;

public class program4 {
    public static void main(String[] args) {
        int n=17;
        int flag=0;
        for(int i=2; i<=13; i++)
        {
            if(n%i==0)
            {
                System.out.println("It not a prime no ");
                flag =1;
                break;
            }
            }
        if(flag==0)
        {
            System.out.println("It is prime no");

        }
    }
}
