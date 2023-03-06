package TravlingZerosInFactorial;

public class Cout_zero
{
    public static void main(String[] args) {
        int out = cout(251);
        System.out.println(out);
    }
    static int cout(int n)
    {
        int res = 0;
        for(int i=5 ; i<= n; i=i*5)
        {
            res = res + n/i;
        }return res;
    }

}
// k <= longbasen rest to n
// time complexcity thita rest to n
