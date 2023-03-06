// super keyword it used to access data member of the super class by super keyword.
//super keyword it used to access constructor of the super class by super keyword.
//super keyword it used to access method of the super class by super keyword.
package PracticeOnPreviousjava;
class company
{
    String name;
    company()
    {
        System.out.println("Hi i am constructor");
    }
    void C1()
    {
        System.out.println("Hi i am method");
    }
}
class customer extends company
{
    String name;
   void C2()
    {
        name = "Ram ";
        System.out.println(name);
        super.name = "flipkart ltd";
        //super.company();
        super.C1();
    }
}
public class program18 {
    public static void main(String[] args) {
        customer obj = new customer();
        obj.C2();
    }
}
