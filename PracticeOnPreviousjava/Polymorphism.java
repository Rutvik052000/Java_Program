// Polymorphism.
// 1. Method Overloading
    //In the class having mulitiple method with the same name and diffrent in the argument is called as method overloading.

// 2. Method Overriding
    //overriding means it is process subclass and parent class with same name.


package PracticeOnPreviousjava;
class poly
{
   void poly()
    {
        System.out.println("Hey i am super class");
    }

}
class poly1 extends poly
{
   void poly()  /// Overiding
    {
        System.out.println(" Hey i am sub class ");
    }
}


public class Polymorphism {
    public static void main(String[] args) {

        poly1 obj = new poly1();
        obj.poly();
    }
}



/*
public class Polymorphism {

    void find()             //Overloading
    {
        int b=10 , h=20;
        double a= 0.5*b*h;
        System.out.println(+a);

    }
    void find(int r)        //Overloading
    {
        double a= 3.14 * r*r;
        System.out.println(+a);
    }

    public static void main(String[] args) {

        Polymorphism P1 = new Polymorphism();
        P1.find();
        P1.find(10);
        // TODO Auto-generated method stub

    }

}                                                           */
