public class Main {
    public static void main(String[] args) {

        int a = 5;

        if (a > 5) {
            System.out.println("A more then 5");
        } else {
            System.out.println("A les or == then 5 ");
        }

        System.out.println("--------------------------");

        int b = 10;

        if (a < 5 && b == 10 ){
            System.out.println("a < 5 b == 10");
        }
        else {
            System.out.println("A > or == 5 & b");
        }

        System.out.println("----------------------------");

        printHello(3);

        System.out.println("----------------------------");

        System.out.println(sumDigit(123456));

        System.out.println("----------------------------");

        printOddNumbers(10);

        System.out.println("----------------------------");

        printStars(48,8);
    }

    /*
    print Stars
    int number -> 100
    int starsInRow -> 5
     */
    public static void printStars(int number,int starsInRow){
        int i = 1 ;                       // Counter for sll amount of stars.
        int j = 1;                        // Counter for stars in row.
        while (i <= number){              // We start our loop from first star till number.
            if (j < starsInRow){          // If counter j < stars in row -> sout *
                System.out.print("*");
                j++;
            }
            else {
                System.out.println("*");
                j = 1;
            }
            i++;
        }
    }


    public static void printOddNumbers(int number){
        for (int i = 1; i <= number; i+=2) {
            System.out.println(i);
        }
    }

    public static void printHello(int number){
        int counter = 0;
        while (number != 0){
            counter++;
            System.out.println("Hello " + counter + " times");
            number--;
        }
    }


    public static int sumDigit(int number){
        int res;
        for (res = 0; number != 0 ; number = number/10) {
            res = res + number/10;
        }
        return res;
    }
}