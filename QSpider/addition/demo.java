//write a program to print additon of even and odd number by arran in the element.

package QSpider.addition;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int arr[]={1,3,5,2,6,8};
        Scanner sc = new Scanner(System.in);
        int even=0;
        int odd=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
            {
                even = even + arr[i];
            }else {
                odd = odd + arr[i];
            }
        }
        System.out.println("If the addition of even number is :"+even);
        System.out.println("If the addition of odd number is :"+odd);

    }
}
