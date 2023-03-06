//It is blue print of the class with in abstraction method and declear with interface keyword
//It used to multiple inheritance and 100% abstraction.

//interface to class you write a implements keyword for
// it is example of interface to class

package QSpider.Interface;
interface Head_bank
{
    public static final int a=10000;
    public abstract void withdraw();
    public abstract void deposit();
}
class BANK implements Head_bank
{
    @Override
    public void withdraw() {
        System.out.println("Withdraw Rs : 1000");
    }

    @Override
    public void deposit() {
        System.out.println("Depostie Rs : 500");
    }
}

public class ATM {
    public static void main(String [] args)
    {
        BANK b1 = new BANK();
        b1.withdraw();
        b1.deposit();
        System.out.println(BANK.a);
        System.out.println(Head_bank.a);
    }

}
