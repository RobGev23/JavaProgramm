public class HomeWork {
    public static void main(String[] args) {

        // Todo
        //  Right  2 methods
        //  IndexOfMinArray
        //  Find min index  of min number in Array
        //  Find  min index of min number in Array from End.
        //  MinDigitInArray
        //  Find min number in Array
        //  Find min number from end
        //  You Tube https://www.youtube.com/watch?v=Iv3vgjM8Py4



        int[] array1 = new int [20];
        fillArray(array1,-10,25);
        printArray(array1);

        System.out.println("------------------------------");
        int[] array2 = new int [25];
        fillArray(array2,-15,15);
        printArray(array2);

        System.out.println("------------------------------");
        int minIndex1 = indexOfMinArray(array1);
        System.out.println("Min index  of min number is " + "[" + minIndex1 + "]");

        System.out.println("------------------------------");
        int minIndex2 = indexOfMinArrayFromEnd(array1);
        System.out.println("Min index of min number from End is " + "[" + minIndex2 + "]");

        System.out.println("------------------------------");
        int minDigit1 = minDigitInArray(array2);
        System.out.println("Min digit is " + minDigit1);

        System.out.println("------------------------------");
        int minDigit2 = minDigitInArrayFromEnd(array2);
        System.out.println("Min digit from End is " + minDigit2);

        /*
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
         */
    }


    public static int minDigitInArrayFromEnd(int[] array){
        int minDigit2 = 0;
        for (int i = array.length-1; i > 0 ; i--) {
            if (array[i] < minDigit2){
                minDigit2 = array[i];
            }
        }
        return minDigit2;
    }

    public static int minDigitInArray(int[] array){
        int minDigit1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minDigit1){
                minDigit1 = array[i];
            }
        }
        return minDigit1;
    }

    public static int indexOfMinArrayFromEnd(int[] array){
        int minIndex2 = 0;
        for (int i = array.length-1; i > 0 ; i--) {
            if (array[i] < array[minIndex2]){
                minIndex2 = i;
            }
        }
        return minIndex2;
    }

    public static int indexOfMinArray(int[] array){
        int minIndex1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minIndex1]){
                minIndex1 = i;
            }
        }
        return minIndex1;
    }
    public static void fillArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (min + Math.random() * (max + 1 - min));
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Arr [" + i + "]" + " = " + array[i]);
        }
    }
}
