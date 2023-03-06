// write a program to find average of even element in given array

package QSpider.Array.program4;

public class average_array {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4,5,6};
        int sum=0;
        int cout=0;
        for (int i=0; i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                sum = sum + arr[i];
                cout++;
            }
        }
        System.out.println("The average of is it : "+sum/cout);
    }
}
