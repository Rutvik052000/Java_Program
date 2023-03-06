// 1. static intializer
    // It is set of instruction execute before main method

package QSpider;

public class intializerBlock1 {
    static int a =34;
    static
    {
        System.out.println("1");
    }
    static
    {
        System.out.println("2");
        System.out.println(a);
    }
    static int b=78;
    static
    {

        System.out.println("3");
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(b);

    }
    static
    {
        System.out.println("4");
    }

}
