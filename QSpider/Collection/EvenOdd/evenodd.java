package QSpider.Collection.EvenOdd;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;
public class evenodd {
    public static void main(String [] args)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(222);
        al.add(321);
        al.add(343);
        al.add(45);
        al.add(453);
        al.add(434);

        Integer temp=0;
        Iterator<Integer> i= al.iterator();
        while(i.hasNext())
        {
            temp=i.next();
            if(temp%2==0)
            {
                System.out.println("Even " + temp);
            }
            else{
                System.out.println("Odd " + temp);
            }
        }


    }

}
