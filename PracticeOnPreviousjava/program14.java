// write a program to write car under sub brand cars.

package PracticeOnPreviousjava;
class Tata
{
    int price = 500000;
    String colour= "black";
    int cc= 1497;
    public void nexon()
    {
        System.out.println("base model");

    }
}
class Tata_tiago extends Tata
{
    int price = 450000;
    String colour= "gray";
    int cc= 1497;
    public void tiyago()
    {
        System.out.println("base model");

    }
}
class Tata_altroz extends Tata_tiago
{

    public void suzuki()
    {
        int price = 600000;
        String colour= "blue";
        int cc= 1497;
        System.out.println("yash");

    }
}
public class program14 {

    public static void main(String[] args) {
       Tata_altroz car1 = new Tata_altroz();
       car1.nexon();
       car1.suzuki();

    }
}
