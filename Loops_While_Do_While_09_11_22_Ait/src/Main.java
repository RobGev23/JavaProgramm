public class Main {
    public static void main(String[] args) {

        int first = 150;
        int second = 180;

        int diff = positivDiff(first,second);

       if (-diff == 10 || diff== 30){
           System.out.println("Hura");
       }
       else {
           System.out.println("Neh");
       }

    }
    public static int positivDiff(int a,int b){
        if (a > b){
            return a - b;
        }
        else {
           return b-a;
        }
    }
}