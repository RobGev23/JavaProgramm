public class MaxIndexFinder {
    public static void main(String[] args) {

        int[] arr1 = new int[20];
        fillArray(arr1,-30,15);
        printArray(arr1);

        System.out.println("--------------------");
        int indexOfMax = maxNumberIndexInArray(arr1);
        System.out.println("Max Index is " + indexOfMax);

        System.out.println("----------------------");
        int indexOfMax2 = maxNumberIndexInArray2(arr1);
        System.out.println("Max Index is " + indexOfMax);

    }
    // Todo
    //  Index of max number in Array.
    public static int maxNumberIndexInArray(int[] array){
        int res = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > res){
                res = i;
            }
        }
        return res;
    }
    // Todo
    //  Right option of method to find max numbers index in Array.
    public static int maxNumberIndexInArray2(int[] array){
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // Todo
    //  Fill random numbers to array.
    public static void fillArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (min + Math.random() * (max + 1 - min));
        }
    }
    // Todo
    //  Print random numbers of array.
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Arr [" + i + "]" + " = " + array[i]);
        }
    }

}
