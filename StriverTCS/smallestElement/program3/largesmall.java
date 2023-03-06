package StriverTCS.smallestElement.program3;

public class largesmall {
    public static void main(String[] args) {
        int arr[] ={1,2,4,7,7,5};
        int temp=0;

        for(int i=0 ; i<arr.length ; i++)
        {
            for( int j= 0 ; j<arr.length ; j++)
            {
                if(arr[i]> arr[j])
                {
                  temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
                }
            }
            for( i=0; i<arr.length; i++)
            {
                System.out.print(arr[i] + " " );
            }
            System.out.println();
            System.out.println("Given array of second smallest element "+arr[1]);
            System.out.println("Given array of second largest element "+arr[4]);

        }


    }
}
