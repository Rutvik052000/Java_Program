// write a program to print a element in even index only
package QSpider.Array.program3;

public class evenindex {
    public static void main(String[] args) {
        int [] arr = {12,34,65,76,87,56,45,64,43,34};
        for(int i=0; i<arr.length; i++)
        {
            if(i%2==0)
            {
                System.out.println(arr[i]);
            }

        }
    }
}
