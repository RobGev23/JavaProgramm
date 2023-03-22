public class HomeWorkCarSpeed {
    public static void main(String[] args) {

        /*
        speed 0 - 10   -> 10 Euro -> 0 points
        speed 11 - 20  -> 30 Euro -> 0 points
        speed 21 - 30  -> 50 Euro -> 1 points
        speed 31 - 100 -> 1000 Euro -> 2 points
         */

        int carSpeed1 = 60;
        int carSpeed2 = 80;
        int carSpeed3 = 100;
        int carSpeed4 = 300;



        int carFine1 = speedCalculator(carSpeed1,40);
        fine(carFine1);
        int carFine2 = speedCalculator(carSpeed2,50);
        fine(carFine2);
        int carFine3 = speedCalculator(carSpeed3,30);
        fine(carFine3);
        int carFine4 = speedCalculator(carSpeed4,30);
        fine(carFine4);


    }

    public static int speedCalculator(int speed, int speedLimit) {
        int overSpeed = 0;
        if (speed > speedLimit) {
            overSpeed = speed - speedLimit;
        }
        return overSpeed;
    }

    public static double fine(int overSpeed) {
        if (overSpeed > 0 && overSpeed <= 10) {
            System.out.println("You exceeded the speed limit by " + overSpeed + " Kmh.You must pay 10 Euro Fine.");
        }
        if (overSpeed > 11 && overSpeed <= 20) {
            System.out.println("You exceeded the speed limit by " + overSpeed + " Kmh.You must pay 30 Euro Fine.");
        }
        if (overSpeed >= 21 && overSpeed <= 30) {
            System.out.println("You exceeded the speed limit by " + overSpeed + " Kmh.You must pay 50 Euro Fine and you have 1 point.");
        }
        if (overSpeed > 31 && overSpeed <= 100){
            System.out.println("You exceeded the speed limit by " + overSpeed + " Kmh.You must pay 1000 Euro Fine and you have 2 point.");
        }
        if (overSpeed > 100){
            System.out.println("You exceeded the speed limit by "  + overSpeed + " Kmh.You must pay 5000 Euro Fine and you can't Drive 6 month.");
        }
        return overSpeed;
    }
}
