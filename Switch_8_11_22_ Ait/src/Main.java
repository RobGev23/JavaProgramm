public class Main {
    public static void main(String[] args) {
        // Petrovich

        double petrovichBalance = 800;
        int petrovichPin = 2545;
        int petrovichIndex = 1;

        // Ivan

        double ivanBalance = 100;
        int ivanPin = 1515;
        int ivanIndex = 2;

        // ATM (int pin,int clientIndex, int choice,double balance)
        // 1 - 50
        // 2 - 100
        // 3 - 200
        // 4 - 500
        // -> index
        // -> Check balance
        // return result = balance - amount

        // Check Client -> index + pin
        // Check Client correct -> Index
        // Check Client incorrect -> Error -1

        System.out.println("Ivan balance before " + ivanBalance);
        ivanBalance = atm(ivanPin,ivanIndex,1,ivanBalance);
        System.out.println("Ivan balance after " + ivanBalance);

    }

    public static double atm(int pin,int clientIndex,int button,double balance){
        int index = checkClient(clientIndex,pin);
        int amount = 0;
        double newBalance = balance;
        if (index <= 0 || index > 2){
            System.out.println("Error Wrong pin no such Client!");
            newBalance = balance;
            return balance;
        }
        switch (button){
            case 1:
                amount = 50;
                System.out.println("You withdraw is 50");
                if (balance >= amount){
                    newBalance = balance - amount;
                    System.out.println("Your new balance is " + newBalance);
                    break;//return newBalance;
                }
                else {
                    System.out.println("Operation can't be completed Incorrect balance");
                    break;
                }
            case 2:
                amount = 100;
                System.out.println("You withdraw is 100 ");
                if (balance >= amount){
                    newBalance = balance - amount;
                    System.out.println("Your new balance is " + newBalance);
                    break;//return newBalance;
                }
                else {
                    System.out.println("Operation can't be completed Incorrect balance");
                    break;
                }
            case 3:
                amount = 200;
                System.out.println("You withdraw is 200");
                if (balance >= amount){
                    newBalance = balance - amount;
                    System.out.println("Your new balance is " + newBalance);
                    break;//return newBalance;
                }
                else {
                    System.out.println("Operation can't be completed Incorrect balance");
                    break;
                }
            case 4:
                amount = 500;
                System.out.println("You withdraw  is 500 ");
                if (balance >= amount){
                    newBalance = balance - amount;
                    System.out.println("Your new balance is " + newBalance);
                    break;//return newBalance;
                }
                else {
                    System.out.println("Operation can't be completed Incorrect balance");
                    break;
                }
        }
        return newBalance;
    }
    public static int checkClient(int clientIndex,int pin){
        if (clientIndex == 1 && pin == 2545){
            System.out.println("Hello Petrovich!");
            return clientIndex;
        }
        if (clientIndex == 2 && pin == 1515){
            System.out.println("Hallo Ivan!");
            return clientIndex;
        }
        else {
            System.out.println("No such Client or wrong pin");
            return -1;
        }
    }

}

