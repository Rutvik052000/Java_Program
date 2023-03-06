// write a program to print even number between 17 and 55
package For;

public class pro1 {
    public static void main(String[] args) {
        int count = 17;
        int[] even = new int[18];
        int[] odd = new int[20];
         for(int i=0 ; i < 38 ; i++)
        {

            count++;
            int current = 1, current2 = 1;
            if(count % 2 == 0) {
                even[i] = count;
                if(current == 1){
                    System.out.println("Even no. is :"+even[i]);{
                        current += 1;
                    }     // (current != 1)
                    {
                        System.out.println("");
                    }
                }

            } else{
                odd[i]= count;
                if(current2 == 1){
                    System.out.println("Even no. is :"+odd[i]);
                    current2++;
                }System.out.println(odd[i]);
            }

        }
    }
}
