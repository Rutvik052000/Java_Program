package PracticeOnPreviousjava;

import java.util.Scanner;

public class Program3 {

    public int showValue = 321213;

    //note :- 1 file no. of classes but only 1 public class.
    public int sum(int n) {
        int total = 0;
        for (int i = 0; i <= n; i++) {
            total = i + total;
        }return total;

    }

    public void main(String[] args) {

    //    int showValue = 4939;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Program3 obj = new Program3();
        int f = obj.sum(n);

        System.out.println(f);

        n = sc.nextInt();

        Program3 obj2 = new Program3();
        int ans = obj2.sum(n);

        System.out.println(ans);



     a vu = new a();
//        xyz.temp;

    }

   class a{
         public void main(String[] args) {





             Program3 xyz = new Program3();
             xyz.showValue = 99999;
             System.out.println(xyz.showValue);
         }

       a(){
           int temp = 45445;
           System.out.println("I'm in class A");
       }
    }

    class b{
        public static void main(String[] args) {
            System.out.println("I'm in class B");
        }
    }

}
