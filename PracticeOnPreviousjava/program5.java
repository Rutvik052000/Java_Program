// write a program to table of given no by using recursive function

package PracticeOnPreviousjava;

public class program5 {
    public static int table(int n) {
        int i = 1;
        if (n == 1) {                           ////ERROR
            return 1;
        } else if (i <= 10)
            return n * table(i++);
            return -1;

    }


    public static void main(String[] args) {

        System.out.println(table(2));

    }
}
