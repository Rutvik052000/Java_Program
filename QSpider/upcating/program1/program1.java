package QSpider.upcating.program1;
class animal
{
    String name;
    void nature()
    {
        System.out.println("Animal");
    }
}
class fish extends animal
{
    String color;
    @Override
    void nature()
    {
        System.out.println("Aqutic animal");
    }
}
public class program1 {
    public static void main(String[] args) {
        animal a = new fish();
        a.name = "GoldFish";
        //a.color = "blue";
        fish f = new fish();
        f.name = "Whale";
        f.color= "Blue";
        System.out.println(a);
        System.out.println("Name : "+a.name);
        a.nature();
        System.out.println(f);
        System.out.println("Name :" + f.name);
        System.out.println("color :" + f.color);
        f.nature();

    }
}
