public class Greter_no_of_three {
    public static void main(String[] args)
    {
        int a=10, b=45, c=45, d=19;
        int res = (a>b) ? ((a > c) ? a : c) : ((b>c) ? b: c) ;
        /* int res1 = (a>b) ? a : b;
        int res2 = (res1 > c) ? res1 : c;
        int res3 = (res2 > d)? res2 :d; */
        
        
        System.out.println("Greater number is :"+res);
    }
}
