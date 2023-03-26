public class HomeWork2 {
    public static void main(String[] args) {

        int[] numbers1 = new int[10];
        int[] numbers2 = new int[34];
        int[] numbers3 = new int[7];

        printArray(numbers2);
        printArray(numbers3);
        printArray(numbers1);
        System.out.println("-----------------------------");

        fillArray(numbers1);
        printArray(numbers1);

        fillArray(numbers2);
        printArray(numbers2);

        fillArray(numbers3);
        printArray(numbers3);

    }
    public static void fillArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            int min = 3;
            int max = 19;
            int randomNumber = (int) (min + Math.random() * (max + 1 - min));
            array[i] = randomNumber;
        }

    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " " );
        }
        System.out.println();
    }
}
