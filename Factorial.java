public class Factorial {
    public static void main(String[] args) {
        //int O = find(23);
        //System.out.println(O);
        int out = fact(5);
        System.out.println(out);
    }
   /* static int find(int n){
        int rev = 1;

        for(int i=2; i<=n; i++){
            rev = rev * i;

        }return rev;

    }
    */
    static int fact(int n){
        if(n==0)
            return 1;
        return n* fact(n-1);
    }

}
