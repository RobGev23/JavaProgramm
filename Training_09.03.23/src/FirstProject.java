public class FirstProject {
    public static void main(String[] args) {

        sunIsUp();
        int chickenWeight = 300;
        int pigWeight = 10000;
        System.out.println("I'm chicken,I weight " + chickenWeight);
        System.out.println("I'm hungry-hungry pig.I want te eat.i weight " + pigWeight);
        chickenWeight = eatWorms(4, chickenWeight);
        System.out.println("Bawk - Bawk,I had A lunch.Now i weight " + chickenWeight);
        sunIsDown();
        chickenWeight = run(chickenWeight);
        System.out.println(run(chickenWeight));
        pigWeight = run(pigWeight);
        System.out.println("It's aint funny ,Oink Oink.I weight " + pigWeight);
        int potatoes = 8;

        pigWeight = eatPotatoes(potatoes, pigWeight);
        System.out.println("Oing so Tasty I weight " + pigWeight);
        pigWeight=run(pigWeight);

        int foxWeight = 7000;
        int eggs=0;
        eggs=produceEgg(eggs);
        System.out.println("Eggs "+eggs);

    }

    static int produceEgg(int eggs){return ++eggs;
    }
    static int eatEgs (int eggs,int oldWeight){
        int newWeight=eggs*40+oldWeight;
        return newWeight;
    }

    static int eatPotatoes(int potatoes, int oldWeight) {
        int newWeight = potatoes * 50 + oldWeight;
        return newWeight;
    }

    static int run(int oldWeight) {
        int weightAfterRun = oldWeight - 20;
        return weightAfterRun;
    }


    static void sunIsUp() {
        System.out.println("Sun Is Up");
    }

    static void sunIsDown() {
        System.out.println("Sun is going down");
    }

    static int eatWorms(int numberOfWorms, int oldWeight) {
        int newWeight = oldWeight + (numberOfWorms * 50);
        return newWeight;
    }
}
