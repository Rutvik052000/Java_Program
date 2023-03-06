package For;

public class AlternatePattern {
    public static void main(String[] args) {

        int input = 5;
        char letter = 'A';
        int number = 1;
        int j = 0;
        for (int i = 1; i <= input ; i++) {
            for (j = 1; j <= input ; j++) {
                if (j % 2 != 0){
                    // odd
                    System.out.print(number + " ");
                    number++;

                    if (number == 10){
                        number = 1;
                    }

                }
                if (j % 2 == 0){
                    //even
                    System.out.print(letter+ " ");
                    letter++;
                    number++;

                    if (number == 2){
                        number = 1;
                    }
                }

                if (number == 10){
                    number = 1;
                }
            }

            number++;
            if (number == 10 ){
                number = 1;
            }

            if (j % 2 == 0){
               // letter++;
            }else {
                number++;
            }
            System.out.println();
        }
    }
}