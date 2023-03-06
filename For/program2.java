// write a program to print natural no. upto 15 if the no is divided by 3 print "hi" and no. is divided by 5 print "Bye"
// and no. is  divided by both print "Hi bye";

package For;

public class program2 {
    public static void main(String[] args) {
        for( int i= 1; i<= 15 ; i++)
        {
            if(i%3==0)
            {

                System.out.println(" Hi " + i);
            }else if(i%5==0)
            {
                System.out.println(" Bye "+ i);
            }else if(i%3==0 && i%5==0)
            {
                System.out.println(" Hi Bye "+ i);
            }
        }
    }
}
