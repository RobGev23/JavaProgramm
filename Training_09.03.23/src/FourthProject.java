public class FourthProject {
    public static void main(String[] args) {

        /*
        1 - Tram price 3.60
        1 - S-Bahn price 3.80
        1 - U-bahn price 3.0
        1 - Bus price 2.50

         */
        int choise = 3;
        double bill = 20;


        ticketSale(choise, bill);
    }

    public static double ticketSale(int choise, double bill) {
        double change = 0;
        switch (choise) {
            case 1:
                double priceTram = 3.60;
                System.out.println("Your choise is Tram. Ticket price is." + priceTram);
                change = bill - priceTram;
                System.out.println("Here is your change " + change);
                //return change;
                break;
            case 2:
                double priceSbahn = 3.80;
                System.out.println("Your choise is S-Bahn. Ticket price is." + priceSbahn);
                change = bill - priceSbahn;
                System.out.println("Here is your change " + change);
                //return change;
                break;
            case 3:
                double priceUbahn = 3.00;
                System.out.println("Your choise is U-Bahn. Ticket price is." + priceUbahn);
                change = bill - priceUbahn;
                System.out.println("Here is your change " + change);
                //return change;
                break;
            case 4:
                double priceBus = 2.50;
                System.out.println("Your choise is Bus. Ticket price is." + priceBus);
                change = bill - priceBus;
                System.out.println("Here is your change " + change);
                //return change;
                break;
            default:
                System.out.println("Error.No such Ticket");
                //return -1;
                break;
        }
        return change;
    }
}