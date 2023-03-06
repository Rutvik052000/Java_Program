package QSpider.Array.program5;

public class bubblesort {
    public static void main(String[] args) {
        int [] arr = {12,34,65,76,87,56,45,64,43,34};
        int temp=0;
        for (int i=0; i<arr.length;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }

        }
        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i] + " ");

    }

}
