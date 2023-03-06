package TCSquestion.Countfrequency;

public class cout {
    public static void main(String [] args)
    {
        int cout=0;
        int arr[]={10,5,10,15,10,5};

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[i]);
                    cout++;
                }
            }
        }
    }

}
