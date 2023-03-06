//This is a program to remove some character and add new

package Qspideronline.removecharacterinstring;

public class removechar {
    public static void main(String[] args) {
        String s1 = "Hello worllod";
        String res="";
        int n=s1.length();
        int a=0;
        while(a<n)
        {
            if(s1.charAt(a)=='l' && s1.charAt(a+1)=='l' && s1.charAt(a+2)=='o')
            {
                res= res +'y';
                a=a+3;
            }
            else{
                res = res + s1.charAt(a);
                a= a+1;
            }
        }
        System.out.println("result is :"+res);
    }
}
