package QSpider.Collection.arraylist;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String [] args)
    {
        ArrayList al = new ArrayList();
        al.add(12);
        al.add(34);
        al.add(34);
        al.add(32);
        al.add(23);

        System.out.println(al);

        ArrayList al1 = new ArrayList(al);
        al1.add(2,65);
        al1.add(4,45);
        System.out.println(al1);

        ArrayList al2 = new ArrayList(al1);
        al2.addAll(al1);

        System.out.println(al2);

        ArrayList al3= new ArrayList(al2);
        al3.add(al2);
        System.out.println(al3);
    }
}
