package TCSquestion.ReverseArray2;

public class reverse1 {

        static void reverseArray(int arr[], int n){
            int p1=0, p2=n-1;
            if(p1<p2)
            {
                int temp = arr[p1];
                arr[p1] = arr[p2];
                arr[p2]= temp;
                p1++;
                p2++;
            }
            for(int i=0; i<n; i++)
            {
                System.out.print(arr[i]+" ");
            }
    }
        public static void main(String[] args) {
            int n = 5;
            int arr[] = { 5, 4, 3, 2, 1};
            reverseArray(arr, n);

        }
    }

