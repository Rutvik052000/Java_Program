// Final keyword
//If declear of class with final keyword then it can not be inherited by any another class is known as final keyword.

package PracticeOnPreviousjava;
final class superclass
{
    superclass()
    {
        System.out.println("Hey I am as a super class ");
    }
}
/* class subclass extends superclass ///// Can not be access of superclass by subclass because superclass has final keyword
{
    subclass()
    {
        System.out.println("can you access me in super class");
    }

}

public class program19 {
    public static void main(String[] args) {
        subclass obj = new subclass();
        obj.superclass();

    }
}                                                                               */
