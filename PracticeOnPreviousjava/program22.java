//Abstraction
   // Abstraction is process hiding some information to the user
// Abstraction class :- is a restricted class that cannot be used to create object
// Abstraction method :- can only be used in an abstraction class, and it does not hava a boby.


package PracticeOnPreviousjava;
abstract class animal
{
    public abstract void animalsound(); // Abstract method(does not have a body.
    public void sleep()
    {
        System.out.println("Zzz");
    }
}
class pig extends animal
{
    public void animalsound()
    {
        // The body of animalsound() porvided here
        System.out.println("The pig says : wee wee");
    }
}

public class program22 {
    public static void main(String[] args) {
        pig obj = new pig() ;// Create a pig object.
        obj.animalsound();
        obj.sleep();
    }
}
