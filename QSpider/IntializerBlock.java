// Intializer block is set of instruction which can perform before main task
// static intializer
// non-static intializer

package QSpider;

public class IntializerBlock {

    {
        System.out.println("Hello Rutvik ");
    }

    public static void main(String[] args) {
        IntializerBlock obj = new IntializerBlock();
        System.out.println("Hello Rushikesh");
    }
}
