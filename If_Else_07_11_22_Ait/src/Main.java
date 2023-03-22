public class Main {
    public static void main(String[] args) {

        // TODO: 11.03.2023
        //  (==)   equal
        //  (>)    more
        //  (<)    less
        //  (>=)   more or equal
        //  (<=)   less or equal
        //  (!=)   not equal
        //  (||)   or
        //  (&&)   and
        //  (else) otherwise


        int height = 160;

        if (height >= 180) {
            System.out.println("I'm super tall.");
        } else {
            System.out.println("Ordinary height.");
        }

        System.out.println("---------------------------------");

        if (height < 160) {
            System.out.println("Your are too small.");
        } else {
            System.out.println("You ara Guliver");
        }

        System.out.println("--------------------------------");

        int a = 5;
        if (a == 3) {
            System.out.println("It is correct.");
        } else {
            System.out.println("It is not correct.");
        }


        System.out.println("------------------------------");
        int digit = 5;
        boolean f = true;

        if (digit > 5 && f == true) {
            System.out.println("Some 1st action.");
        } else {
            System.out.println("Some 2nd action.");
        }

        System.out.println("------------------------------------");

        int digit2 = 130;
        boolean j = false;

        if (digit2 < 100 || j != true) {
            System.out.println("Some action 3 ");
        } else {
            System.out.println("Some action 4 ");
        }

        System.out.println("-------------------------");

        // Method max -> 5 and 4

        double result = max(7, -9);
        System.out.println("Result max Method " + result);
        //System.out.println(max(7,9));

        System.out.println("-----------------------------");

        double minRes = min(11, -25);
        System.out.println("Result min Method " + minRes);

        System.out.println("----------------------------");


        double result2 = min2(34, 88);
        System.out.println("Result min Method " + result2);

        System.out.println("------------------------------");

        double result3 = min2(32, 89);
        System.out.println("Result min Method " + result3);

        System.out.println("---------------------------------");

        checkWork(18);
        checkWork(65);
        checkWork(66);
        checkWork(15);

        System.out.println("---------------------------------");

        double result5 = number(0);
        System.out.println("Print result 5 -> " + result5);

        System.out.println("----------------------------------");

        checkToWork2(65, true);

        System.out.println("-----------------------------------");

        // Height ->
        // 0 - 120 Go Home
        // 121 - 140 Go to Walk
        // 141 - 180 Go NBA
        // 181 + You Alien go to cosmos

        checkHeight(181);


    }

    public static void checkHeight(int height) {
        if (height < 0) {
            System.out.println("Check your height again.");
        }
        if (height >= 0 && height <= 120) {
            System.out.println(" Go home.");
        }
        if (height > 120 && height <= 140) {
            System.out.println("Go to Walk.");
        }
        if (height > 140 && height <= 180) {
            System.out.println("Go to NBA.");
        }
        if (height > 180) {
            System.out.println("You Alien go to cosmos. ");
        }
    }


    public static void checkToWork2(int age, boolean sex) {
        if (age >= 18 && age <= 65 && sex == true) {
            System.out.println("Go to Work.");
        } else {
            System.out.println("Go to Fun.");
        }

    }

    public static double number(double digit) {
        if (digit > 0) {
            return 1;
        }
        if (digit == 0) {
            return 0;
        }
        return -1;
    }


    public static void checkWork(int age) {
        if (age >= 18 && age <= 65) {
            System.out.println("Go to Work");
        } else {
            System.out.println("Go have Fun!");
        }
    }

    public static double max(double x, double y) {
        double res = 0;
        if (x > y) {
            res = x;
        } else {
            res = y;
        }
        return res;
    }

    public static double min(double x, double y) {
        double res = 0;
        if (x < y) {
            res = x;
        } else {
            res = y;
        }
        return res;
    }

    public static double min2(double x, double y) {
        if (x > y) {
            return x;
        }
        return y;
    }
}