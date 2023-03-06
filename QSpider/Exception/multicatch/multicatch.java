package QSpider.Exception.multicatch;

public class multicatch {
    public static void main(String[] args) {
        int arr[]= null;
        int a = 10;
        int b= 10;
        String str = "Hello";

        try
        {
            System.out.println(str.charAt(10));
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("There is an the exception of you entering a index number is not found in string");
        }
        System.out.println("Thank you");
    }
}
