//Single level inheritance
//defination : In single level inheritance child class inherits from a single parent class only.

package PracticeOnPreviousjava;
class parent {
    void salary()
    {
        System.out.println("Salary = 20000");
    }
}
class child extends parent
{
    void Bonus()
    {
        System.out.println("Bonus = 5000");
    }
}

public class program16 {

    public static void main(String[] args) {
        child obj = new child();
        obj.salary();
        obj.Bonus();
    }
}
