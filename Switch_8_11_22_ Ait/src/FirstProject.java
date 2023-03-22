public class FirstProject {
    public static void main(String[] args) {
        // Todo;
        //  1 - +
        //  2 - -
        //  3 - *
        //  4 - /

        double res5 = calculator(35,0,4);
        System.out.println("Result in main is " + res5);

    }
    public static double calculator(double a,double b,int oper){
        double result = 0;
        if (oper < 1 || oper > 4){
            System.out.println("ERROR 404 Wrong operation");
            //return result;
        }
        if (oper == 1){
            result = a +b;
            System.out.println("Result a + b is " + result);
            //return result;
        }
        if (oper == 2){
            result = a - b;
            System.out.println("Result a - b is " + result);
            //return result;
        }
        if (oper == 3){
            result = a * b;
            System.out.println("Result a * b is " + result);
            //return result;
        }
        if (oper == 4){
            if (b == 0){
                System.out.println("Error 308 div by zero ");
                return -1;
            }
            else {
                result = a / b;
                System.out.println("Result a / b is " + result);
                //return result;
            }
        }
        return result;
    }

}


