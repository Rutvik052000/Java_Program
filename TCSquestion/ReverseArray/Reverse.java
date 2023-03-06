package TCSquestion.ReverseArray;

public class Reverse {
    static void printArray(int arr[] ,int n)
    {
        int[] arr1 =new int[n];
        for(int i=n-1; i>=0 ; i--)
        {
                arr1[n-i-1] = arr[i];
        }
        System.out.println("Reverse array is :- ");
        for(int i=0; i< n; i++)
        {
            System.out.print(arr1[i] + " ");
        }

    }
    public static void main(String []args)
    {
        int arr[]={5,4,3,2,1};
        int n=5;
        printArray(arr, n);
    }
}
