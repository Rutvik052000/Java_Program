package TravlingZerosInFactorial;

public class coutzero {
    public static void main(String[] args) {
        int Out = factorial(23);
        System.out.println(Out);

    }
    static int factorial(int n)
    {
        int fact= 1;
        for(int i=2; i<=n ; i++)
        {
            fact = fact * i;
        }
        int res =0;
        while(fact % 10 == 0)
        {
            res++;
            fact = fact /10;
        }return res;
    }

}
