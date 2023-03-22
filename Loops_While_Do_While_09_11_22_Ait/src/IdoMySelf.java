public class IdoMySelf {
    public static void main(String[] args) {
        int first = 25;
        int second = 240;

        calculator(first,second);
    }

    public static double calculator(double num1,double num2){
        double result = num1 - num2;
        if (result == 10 || result == 30){
            System.out.println("Huray");
        }
        else {
            System.out.println("Neh");
        }
        return result;
    }
}


