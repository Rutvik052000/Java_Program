package QSpider.Array.program1;

import java.util.Scanner;

public class print_array_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n = sc.nextInt();
        int [] array= new int[10];
        System.out.println("Enter the elements of the array: ");
        for (int i=0; i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Array element are :");
        for (int i=0; i<n;i++)
        {
            System.out.println(array[i]);
        }

    }
}
