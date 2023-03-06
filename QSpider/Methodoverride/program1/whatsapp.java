package QSpider.Methodoverride.program1;

public class whatsapp {
    void whatsapp()
    {
        System.out.println("one tik to send massage");
    }
}
class whatsapp1 extends whatsapp
{
    @Override
    void whatsapp()
    {
        System.out.println("Double tik to read massage");
    }

}
class whatsapp2 extends whatsapp1
{
    @Override
    void whatsapp()
    {
        System.out.println("Double tik to read and show by sender as blue color tick");
        System.out.println("Add new feature as a voice call by internet");
    }
    public static void main(String [] args)
    {
        whatsapp2 w1= new whatsapp2();
        w1.whatsapp();
    }
}
