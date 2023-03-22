public class SecondProject {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Integer " + a);
        float b = 1.3f;
        System.out.println("Float " + b);
        double pi = 3.14;
        System.out.println("Double " + pi);

        boolean k = false;
        boolean f = true;
        System.out.println(k);
        System.out.println(f);

        // BVG - Ticket Automate
        // 1 - Tram ticket
        // 2 - U-Bahn ticket
        // 3 - S-Bahn ticket
        // 4 - Bus ticket

        ticketChoise(9);

        /*
        Supper Man
        1 - go to Hospital.
        2 - go to Work with Hummer.
        3 - go to Circus.
        4 - You ara Shiva get a ticket to India.
        5 - Default.
         */

        supperPuperMan(4);

        /*
        FAN
        0 - off.
        1 - slow mode.
        2 - middle mode.
        3 - turbo.
        4 - default.
         */

        fanPower(0);
        fanPower(1);
        fanPower(2);
        fanPower(3);
        fanPower(4);
        fanPower(10);



    }



    static void fanPower(int mode){
        switch (mode){
            case 0:
                System.out.println("Off");
                break;
            case 1:
                System.out.println("Slow Mode.");
                break;
            case 2:
                System.out.println("Middle Mode.");
                break;
            case 3:
                System.out.println("Turbo Mode.");
                break;
            default:
                System.out.println("Error try again.");
                break;

        }
    }

    static void supperPuperMan(int armAmount){
        switch (armAmount){
            case 1:
                System.out.println("Wow you need Help.");
                System.out.println("You must go to Hospital.");
                break;
            case 2:
                System.out.println("You are OK.");
                System.out.println("You must go to Work with Hummer.");
                break;
            case 3:
                System.out.println("You miracle.");
                System.out.println("You must go to Circus.");
                break;
            case 4:
                System.out.println("You have four Hands.");
                System.out.println("You ara Shiva get a ticket to India.");
                break;
            default:
                System.out.println("It's your problem,I don't care.");
                break;
        }
    }

    static void ticketChoise(int button) {     //Switch - case.
        switch (button) {
            case 1:
                System.out.println("Printing Tram ticket...");
                System.out.println("You've got Tram ticket thank you.");
                break;   // stop function.
            case 2:
                System.out.println("Printing U-Bahn ticket...");
                System.out.println("You've got U-Bahn ticket thank you.");
                break;   // stop function.
            case 3:
                System.out.println("Printing S-Bahn ticket...");
                System.out.println("You've got S-Bahn ticket thank you.");
                break;   // stop function.
            case 4:
                System.out.println("Printing Bus ticket...");
                System.out.println("You've got Bus ticket thank you.");
                break;   // stop function.
            default:
                System.out.println("Error 486 There is no such ticket");
                System.out.println("Try again");
                break;
        }
    }


}
