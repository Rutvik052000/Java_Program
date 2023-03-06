package QSpider.comparator;
import java.util.Arrays;
import java.util.Comparator;
class Laptop
{
    String brand;
    int ram;
    int ssd;
    double price;
    Laptop(String brand, int ram, int ssd, double price)
    {
        this.brand= brand;
        this.ram = ram;
        this.ssd = ssd;
        this.price= price;
    }
    @Override
    public String toString()
    {
        return "Brand"+brand+", Ram"+ram+", SSD"+ssd+", price"+price;
    }
}
class Ramcomparator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2) {
        Laptop L1 =(Laptop) o1;
        Laptop L2 = (Laptop) o2;
        if(L1.ram<L2.ram)
            return -1;
        if(L1.ram>L2.ram)
            return +1;
        return 0;
    }
}
class pricecomparator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
        Laptop L1 = (Laptop) o1;
        Laptop L2 = (Laptop) o2;
        if(L1.price< L2.price)
            return 1;
        if(L2.price> L2.price)
            return -1;
        return 0;
    }
}
public class LaptopDriver {
    public static void main(String[] args) {
        Laptop L1 = new Laptop("Hp",16,256,52000);
        Laptop L2 = new Laptop("Dell",8,128,48000);
        Laptop []arr = {L1,L2};
        Arrays.sort(arr, new Ramcomparator());
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr,new pricecomparator());
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }
}
