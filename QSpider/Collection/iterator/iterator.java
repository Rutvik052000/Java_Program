package QSpider.Collection.iterator;
import QSpider.Collection.arraylist.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
public class iterator {
    public static void main(String [] args)
    {
        ArrayList al = new ArrayList();
        al.add(34);
        al.add("Hello");
        al.add('c');
        al.add(232.3);
        al.add(333);
        al.add(564);

        Iterator i = al.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next() + " ");
        }
        try
        {
            System.out.println(i.next());
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Excessption handdle sucessufully");
        }
    }
}
