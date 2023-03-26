public class HomeWork {
    public static void main(String[] args) {

        //Todo
        // Homework from 17.11.22
        // Create array from 37 elements,and fill it with numbers (from 3 to 37)
        // Print array .

        int[] numbers = new int[37];
        for (int i = 0; i < numbers.length; i++) {
            int min = 3;
            int max = 19;
            int randomNumber = (int) (min + Math.random() * (max + 1 - min));
            numbers[i] = randomNumber;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
