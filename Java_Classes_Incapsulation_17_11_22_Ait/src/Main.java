public class Main {
    public static void main(String[] args) {
        double x = Math.random();
        System.out.println(x);
        System.out.println(x);
        System.out.println("-----------------------------");

        int max = 7; // Upper bound.
        int min = 3; // Lower bound.
        int y = (min + (int) Math.random() * (max - min + 1));
        System.out.println(x);
        System.out.println(y);
        System.out.println("-----------------------------");

        double b = Math.random();
        System.out.println(b);
        System.out.println("-----------------------------");

        int max2 = 19;
        int min2 = 0;
        int randomNumber = (int)(min2 + Math.random() * (max2 - min2 + 1));
        String[] answers ={
                "It is certain",
                "It is decidedly so",
                "Without a doubt",
                "Yes, definitely",
                "You may rely on it",
                "As I see it, yes",
                "Most likely",
                "Outlook good",
                "Signs point to yes",
                "Yes",
                "Reply hazy, try again",
                "Ask again later",
                "Better not tell you now",
                "Cannot predict now",
                "Concentrate and ask again",
                "Don’t count on it",
                "My reply is no",
                "My sources say no",
                "Outlook not so good",
                "Very doubtful"
        };
        String color = "blue";
        if (randomNumber >= 5 && randomNumber < 10){
            color = "green";
        }
        if (randomNumber >= 10 && randomNumber < 15){
            color = "yellow";
        }
        if (randomNumber >= 15){
            color = "red";
        }
        System.out.println(answers[randomNumber] + " -> Color: " + color);
    }

}