public class cout {
    public static void main(String[] args) {
        int p = countdigits(780);
        System.out.println("Number of digits is "+p);
    }
    static int countdigits(int x){
        int res =0;
        while(x > 0)
        {
            x= x/10;
            res ++;
        }
        return res;
    }
}