public class ThirdProject {
    public static void main(String[] args) {

        double tom1 = 30;
        double tom2 = 20;
        tom1 = changeCoffee(tom1);
        System.out.println("Tom has in main function " + tom1);
        tom2 = changeCoffee(tom2);
        System.out.println("Tom has in main function " + tom2);

        int c1 = ticket(2);
        System.out.println(c1);
    }

    public static int ticket(int choise){
        switch (choise){
            case 1:
                System.out.println("Your choise is 1.");
                int x = 10;
                return x;
            case 2:
                System.out.println("Your choise is 2.");
                int y = 20;
                return y;
            default:
                System.out.println("Error no such choise");
                return -1;
        }
    }

    public static double changeCoffee(double amount){
        double priceCoffee = 3.1;
        double change = amount-priceCoffee;
        System.out.println("Here is your coffee.");
        System.out.println("Your change is " + change);
        return change;
    }
}
