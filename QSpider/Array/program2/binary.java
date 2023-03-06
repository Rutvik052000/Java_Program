// write a program of binary search

package QSpider.Array.program2;

public class binary {
    public static void main(String[] args) {
        int [] arr = {12,34,34,45,56,34,32};
        int a=3;
        int flag=1;

        for(int i=0;i<arr.length; i++)
        {
            if(arr[i]==a)
            {
                flag=1;
            }
            else
                flag=0;
        }
        if(flag==1)
        {
            System.out.println("Yes it is present");
        }
        else
        {
            System.out.println("you record is not matching in array");
        }

    }
}
