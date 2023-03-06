package QSpider.Method_Overiding;
class instagram_v1
{
    void post()
    {
        System.out.println("Post your image");
    }
}
class instagram_v2 extends instagram_v1
{
    @Override
    void post()
    {
        super.post();
        System.out.println("Also you can post video");
    }
    void DM()
    {
        System.out.println("Text");
    }

}
class instagram_v3 extends instagram_v2
{
    @Override
    void post()
    {
        super.post();
        System.out.println("You can add bio");
    }
    @Override
    void DM()
    {
        super.DM();
        System.out.println("Images");
    }
    void reel()
    {
        System.out.println("Reels");
    }


}

public class MethodOverriding {
    public static void main(String[] args) {
        System.out.println("start instagram");
        instagram_v3 i1 = new instagram_v3();
        i1.post();
        i1.DM();
        i1.reel();
        System.out.println("Instagram run sucessfully");

    }
}
