// Method overrideing
//Method overrideing is a process to inherited method from parent class and change in implimention of child class.

package QSpider;
class whats_v1
{
    void disply()
    {
        System.out.println("single tick of massages ");
    }
}
class whats_v2 extends whats_v1
{
    @Override
    void disply()
    {
        super.disply();
        System.out.println("double tick of massage sending");
    }
    void call()
    {
        System.out.println("You used to voice call Sysytem ");
    }

}
class whats_v3 extends whats_v2
{
    @Override
    void disply()
    {
        super.disply();
        System.out.println("Blue tick of read massages");
    }
    @Override
    void call()
    {
        super.call();
        System.out.println("you can used video call also");
    }
    void status()
    {
        System.out.println("status you can apply");
    }


}
public class constractor_Override {
    public static void main(String[] args) {
        System.out.println("Whats app start");
        whats_v3 w1 = new whats_v3();
        w1.disply();
        w1.call();
        w1.status();
        System.out.println("whats app Run sucessfully ");
    }
}
