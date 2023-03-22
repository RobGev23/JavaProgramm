public class Arrays {
    public static void main(String[] args) {

        int[] myNumbers = {6,7,8,9,10,11};
        System.out.println(myNumbers.length);

        System.out.println("------------------");
        System.out.println(myNumbers[1]);

        System.out.println("------------------");
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(myNumbers[i]);
        }

        System.out.println("------------------");
        myNumbers [2] = 22;
        System.out.println(myNumbers[2]);

        System.out.println("------------------");
        int[] array = new int[5];
        System.out.println(array.length);

        System.out.println("------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("------------------");
        String[] fruit = {"apple","mango","lemon","orange"};
        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i]);
        }

        System.out.println("------------------");
        System.out.println("First " + fruit[0]);
        System.out.println("Second " + fruit[1]);
        System.out.println("Third " + fruit[2]);
        System.out.println("Fourth " + fruit[3]);

        System.out.println("------------------");
        System.out.println(fruit.length);

        System.out.println("------------------");
        for (int i = 0; i < fruit.length; i++) {
            System.out.println(i);
        }

        System.out.println("------------------");
        for (int i = fruit.length-1; i >= 0; i--) {
            System.out.println(fruit[i]);
        }

        System.out.println("------------------");
        for (int i = 1; i < fruit.length-1 ; i++) {
            System.out.println(fruit[i]);

        }
    }
}
