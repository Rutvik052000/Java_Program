package QSpider.CollectionSelfPreparation.ArrayList.Arraylist2;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(10);
        num.add(45);
        num.add(78);
        num.add(23);
        System.out.println(num);

        for(int i=0; i<num.size();i++)
        {
            System.out.println("The element is " + num.get(i));
        }

        for(Integer element : num)
        {
            System.out.println("The element is " + element);
        }

        Iterator<Integer> it = num.iterator();

         if(it.hasNext())
             System.out.println("iterator" + it.next());
    }

}
