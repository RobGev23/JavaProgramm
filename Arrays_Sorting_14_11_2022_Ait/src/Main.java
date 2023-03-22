public class Main {
    public static void main(String[] args) {

        showNumbers();
        System.out.println("-----------------");
        showNumbers2();

    }
    public static void showNumbers(){
        for (int i = 1; i <= 10; i= i+=2) {
            System.out.println(i);
        }
    }

    public static void showNumbers2(){
        for (int i = 0; i <= 12; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}