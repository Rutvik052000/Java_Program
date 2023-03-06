public class palindrom {
    public static void main(String[] args) {
    boolean o = check( 121);
        System.out.println(o);
    }

    static boolean check(int n) {
        int rev=0;
        int  ld=0;
        int temp = n;
        while(temp != 0) {
             ld = temp % 10;
            rev = rev * 10 + ld;
            temp = temp/10;
        }return (rev == n);
    }
}