public class LoopFor {
    public static void main(String[] args) {

        gagarin();

        System.out.println("----------------------------------");

        System.out.println("Res of SumOf digits " + sumOfDigits(123456));

        System.out.println("----------------------------------");

        System.out.println("Res powXY " + powXY(2,5));

        System.out.println("----------------------------------");

        pythagoras();

    }


    public static void pythagoras(){
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + "\t");  // \t = Iterazia
            }
            System.out.println();
        }
    }

    public static int powXY(int x,int y){
        int res = 1;
        for (int i = 1; i <= y ; i++) {         // i = counter
            res = res * x;
        }
        return res;
    }

    public static int sumOfDigits(int number){
        int res ;
        for (res = 0; number != 0 ; number/=10) {
            int digit = number % 10;
            res = res + digit;
        }
        return res;
    }


    public static void gagarin(){
        for (int i = 5; i > 0 ; i--) {
            System.out.println(i);
        }
        System.out.println(" -- Go to spase --");
    }
}
