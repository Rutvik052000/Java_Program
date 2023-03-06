
//element removeing in list problem
package QSpider.Collection.elementremovelist;
import java.util.ArrayList;

public class remove {
    public static void main(String [] args)
    {
        ArrayList al= new ArrayList();
        al.add(23);
        al.add(34);
        al.add(65);
        al.add(278);
        al.add(454);

        System.out.println(al);
        al.remove(2);   //remove a element with index number only
        System.out.println(al);

        al.remove((Integer) 278); // remove a element with write a data type and element
        System.out.println(al);

        ArrayList al1= new ArrayList(al);
        al1.add(343);
        al1.add(433);
        al1.add(856);
        al.removeAll(al1);
        System.out.println();
        System.out.println(al1);


    }
}
