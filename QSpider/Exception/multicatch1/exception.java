package QSpider.Exception.multicatch1;

public class exception {
    public static void main(String [] args)
    {
        int arr[]= null;
        int a=19, b=0;
        String str= "Rutvik";

        try
        {
            System.out.println(arr[4]);
            //System.out.println(a/b);
            System.out.println(str.charAt(6));
        }catch(ClassCastException w)
        {
            System.out.println("Class cast exception handle");
        }
        catch(NullPointerException w)
        {
            System.out.println("Null pointer exception handling");
            System.out.println(w.getMessage());
        }catch(ArithmeticException w)
        {
            System.out.println("Arithmatic exception handling");
        }catch(IndexOutOfBoundsException w)
        {
            System.out.println("Index out of bounds exception handle");
            w.printStackTrace();
        }
        System.out.println("Thank you");
    }
}
