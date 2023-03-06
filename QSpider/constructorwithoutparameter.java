package QSpider;
class car
{
   String model;
   int cc;
   car()
   {
       model = "Creta";
       System.out.println("Model of hyundai : " + model);       //no parameterise Constructor
   }
    {
        System.out.println("Brand : Hyundai");                  // non static intializer
    }
    void method()
    {
        cc = 1400;
        System.out.println("Engine capacity is : "+cc+"cc");         // Method
    }

    car(String a1 , String a2)
    {
        System.out.println("Manual gear system ");          // constructor with parameterise
        System.out.println("Petrol Engine ");
    }


}

public class constructorwithoutparameter {
    static
    {
        System.out.println("I have money to buy my dream Car");     // static intializer
    }
    public static void main(String[] args) {
        car obj = new car();
        car obj1 = new car("Dada", "Saheb");
        obj.method();

    }

}
