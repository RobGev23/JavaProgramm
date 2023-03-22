public class NewProject {
    public static void main(String[] args) {

        int number = 100;
        int number1 = 300;
        int number2 = 150;
        int number3 = -250;

       calculate(number);

        System.out.println("-------------");

       more200(number1);
       more200(number2);
       more200(number3);

       System.out.println("--------------");

       different(number1);
    }

    public static void different(int input){
        if (input > 200){
            System.out.println("+");
        } else if (input < - 200) {
            System.out.println("-");
        } else  {
            System.out.println("OK");
        }
    }


    public static void more200(int input){
        if (input >= 200){
            System.out.println("+");
        }
        if (input < -200){
            System.out.println("-");
        }
        if (input < 200 && input >= -200){
            System.out.println("OK");
        }
    }

    public static int calculate(int number){
        int result = 0;
        if (number >= 200){
            System.out.println("+");
        }
        if (number < -200){
            System.out.println("-");
        }
        if (number < 200 && number >= -200){
            System.out.println("OK");
        }
        return result;
    }
}