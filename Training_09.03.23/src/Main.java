
public class Main {
    public static void main(String[] args) {


        int d, fa;
        d = 6;
        fa = d++ + ++d; // 13
        System.out.println(fa); // 14

        System.out.println("-----------");

        int ra = 15;
        int rav = ra-- - --ra;  // 15 | 14
        System.out.println(rav);  // 0

        System.out.println("--------------");

        int a = 243554;
        System.out.println(lastDigit(a));
        System.out.println(last2Digit(a));
        System.out.println(last2Digit(a));

        int b, c, g;
        b = 10;
        c = 45;
        d = 86;

        System.out.println("-------------------------------------------------------------");

        float sumStart = 1000000;
        float inGermany1 = way1(sumStart);
    }

    public static float way1(float sum){
        float mongol = (sum);
        float kazakhstan =(sum);
        float romania=(sum);
        return sum;
    }

   // public static float romania(float sumR){
     //   float sumR= sumR-(sumR*0.07);
       // return sumR;
   // }

    public static int lastDigit(int a) {
        int res = a % 10;
        System.out.println("Res is " + res);
        return res;
    }

    public static int last2Digit(int a) {
        return a % 100;
    }

    public static int last3Digit(int a) {
        return a % 100;
    }
}