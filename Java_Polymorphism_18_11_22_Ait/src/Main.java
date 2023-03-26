public class Main {
    public static void main(String[] args) {

        tossCoin();

    }
    public static void tossCoin(){
        int min = 0;
        int max = 1;
        int randomNumber = (int) (min + Math.random() * (max + 1 - min));
        String[] answers = {"Head","Tail"};
        System.out.println(answers[randomNumber]);
    }
}