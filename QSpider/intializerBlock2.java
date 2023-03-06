// non-static intializer
    // This are set of instruction before are object creation.

package QSpider;

public class intializerBlock2 {
     int a = 343;
    {
        System.out.println("1");
    }
    {
        System.out.println(a);
        System.out.println("2");
    }
    {
        System.out.println("3");
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        intializerBlock2 obj = new intializerBlock2();
        System.out.println(obj.a);
        //intializerBlock2 obj1 = new intializerBlock2(); // It is execute seperately for every not object.

    }
    {
        System.out.println("4");
    }


}
