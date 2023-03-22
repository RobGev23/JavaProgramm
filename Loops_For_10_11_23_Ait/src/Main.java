public class Main {
    public static void main(String[] args) {

        gagarin(3);
        System.out.println("...............................");

        double a = 3;
        int b = 3;
        double resInMain = powXY(a, b);
        System.out.println("Res in main = " + resInMain);
        System.out.println("...............................");

        System.out.println(powXY(3, 3));

        System.out.println("...............................");

        int c = 14938;
        int d = c / 10;
        System.out.println("D = " + d);

        int cdr = countDigits(0);
        System.out.println("Amount of digits is " + cdr);

        System.out.println("Amount " + countDigits(3546359));

        System.out.println("................................");

        int sum = sumOfDigits(123456);
        System.out.println("Sum of digits is " + sum);

        System.out.println("Sum of digits is " + sumOfDigits(123456));
    }

    public static int sumOfDigits(int number) {
        int result = 0;
        while (number != 0) {
            int digit = number % 10;
            result = result + digit;
            number = number / 10;
        }
        return result;
    }


    public static int countDigits(int number) {
        int counter = 0;
        do {
            counter++;
            number = number / 10;
        }
        while (number != 0);
        return counter;
    }


    public static double powXY(double x, int y) {
        double result = 1;
        int counter = 1;
        while (counter <= y) {
            result = result * x;
            counter++;
        }
        return result;
    }


    public static void gagarin(int input) {
        int counter = input;
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Go to Spase");
    }

}