public class ThreePositive {
    public static void main(String[] args) {

        int a = 12;
        int b = 7;
        int c = -20;

        System.out.println(positiveNumber(a,b,c));

    }

    public static int positiveNumber(int x1,int x2,int x3){
        int count = 0;
        if (x1 > 0 ){
            count ++;
        }
        if (x2 >0){
            count += 1;
        }
        if (x3 > 0){
            count = count + 1;
        }
        return count;
    }
}
