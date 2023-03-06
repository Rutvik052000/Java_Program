//Program on pattern
/* * * * *      *           1           1           * * *         * * *         *           11111       1a3b5       1     A1111
   * * * *      * *         1 2         2 2         * *             * *        * *          AAAAA       7c9d1       23    1B111
   * * * *      * * *       1 2 3       3 3 3       *                 *       * * *         22222       3e5f7       456   11C11
                                                                                            BBBBB       9g1h3       78910 111D1
                                                                                            33333       5i7j9             1111E
 */


package For;

public class program5 {
    public static void main(String[] args) {

        // first pattern
     /*   for(int i=1 ; i<=3 ; i++)    // it work on rows
        {
            for(int j=1 ; j<=4 ; j++)   // it work on cloums
            {
                System.out.print(" * ");
            }
            System.out.println();
        }                                   */

     /*   // second pattern
            for(int i=1; i<=3 ; i++)
            {
                for(int j=1; j<=i ; j++)
                {
                    System.out.print(" * ");
                }
                System.out.println();
            }                                */

    /*    // third pattern
        for( int i=1; i<=3; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(" "+j+" ");
            }
            System.out.println();       */
/*
        // Four pattern
       for( int i=1; i<=3; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(" "+i+" ");
            }
            System.out.println();

        }                                       */

   /*     // Fifth pattern
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=4-i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }                                       */


        // six pattern

    /*    for (int i = 4; i <= 1 ; i--) {
            for(int space = 4; space >= i ; space--) {
                System.out.println(" ");
            }

            for (int j = 1; j <= i; j++) {      /////wrong hai BC six wala
                System.out.print("* ");
            }
            System.out.println("");


            System.out.println();
        }
                                                                */
        // seventh pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j>=i ; j--) {
                System.out.print(" ");}
                for(int k=1 ; k<=i ; k++){
                    System.out.print("* ");
                }
            System.out.println();
            }
            System.out.println();

    /*   int nummber = 1;
       char letter = 'A';

        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5;j++)
            {
                if(i%2==0)
                {
                    System.out.print(nummber+ " ");
                }else{
                    System.out.print(letter+ " ");
                }


            }

            // inc , dec letter and nuber
            if(i%2==0){
               nummber++;
            }else{
               letter++;
            }
            System.out.println();

        }                                           */
     /*   char ch = 'a';
        int num = 1;
        int flag = 0;
        int j=0;
            for(int i=1; i<=5;i++)
            {

                for( j=1; j<=5;j++)
                {
                    if(j%2 != 0)
                    {
                        System.out.print(num + " ");
                        num++;

                        if(num ==10)
                        {
                         num=1;
                        }

                    }
                    if(j%2==0)
                    {
                        System.out.print(ch + " ");
                        ch++;
                        num++;

                        if (num == 2)
                            num = 1;

                        if(ch==2)
                        {
                            ch=1;
                        }
                    }
                    if(num==10)
                    {
                        num=1;
                    }
                }

                num++;
                if(num==10)
                {
                    num=1;
                }
                if(j%2==0)
                {
                    //ch++
                }else
                {
                 num++;
                }
                System.out.println();
            }                                       */
        /* int a=1;
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                System.out.print(a);
                a++;
                if(a==10)
                {
                    a=1;
                }
            }
            System.out.println();
        }                               */
   /*         int a=1;
            for(int i=1;i<=5;i++)
            {
                for(int j=1;j<=i;j++)
                {
                   if(i%2!=0)
                   {
                       System.out.print(a);
                       a++;
                   }else{
                       System.out.print(a);
                       a++;
                   }

                }
                System.out.println();
            }                               */
        /*    char letter = 'A';
            for(int i=1; i<=5; i++)
            {
                for(int j=1; j<=5; j++)
                {
                    if(i==j)
                    {
                        System.out.print(letter + " ");
                        letter++;
                    }else{
                        System.out.print("1"+" ");

                }

                }
                System.out.println();
            }                                           */
        }
    }

