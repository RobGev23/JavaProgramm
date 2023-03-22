public class Main {
    public static void main(String[] args) {

        int[] arr = new int[5];     // 1st initialization.

        arr[3] = 100500;
        System.out.println(arr[3]);

        System.out.println("----------------");

        arr[1] = arr[3]/100;
        System.out.println(arr[1]);

        System.out.println("----------------");
        int arraySize = arr.length;
        System.out.println("Length Array arr " + arraySize);

        System.out.println("----------------");
                   // {0, 1, 3, 4,  5,  6,  7 } -> index
        int [] arr2 = {4, 6, 8, 14, 25, 35, 46};   // 2nd initialization.
        System.out.println(arr2[3]);

        System.out.println("----------------");
        System.out.println("Length arr2 " +arr2.length);

        System.out.println("----------------");
        int i = 0;
        System.out.println(arr2[i]);
        i++;  // increment array index
        System.out.println(arr2[i]);
        i++;  // increment array index
        System.out.println(arr2[i]);
        i++;  // increment array index
        System.out.println(arr2[i]);

        System.out.println("----------------");
        printArray(arr);

        System.out.println("----------------");
        printArray(arr2);

        System.out.println("----------------");
        int[] arr3 = {12,35,65,89,45,72,75};
        printArray(arr3);

        System.out.println("----------------");
        int[] arr4 = new int[30];
        fillArray(arr4,-100,100);
        printArray(arr4);

        System.out.println("----------------");
        printArray2(arr4);

        System.out.println("----------------");
        int var = 10;
        System.out.println("Variable before Method = " + var);
        variableChange(var);
        System.out.println("Variable after Method = " + var);

        System.out.println("----------------");
        int[] arr5 = {5,3,5};
        System.out.println("Arr [0] before Method = " + arr5[0]);
        changeArray(arr5);
        System.out.println("Arr [0] after Method = " + arr5[0]);
    }

    public static void changeArray(int[] arr) {
        arr[0] = arr[0] * arr[0];
        System.out.println("Arr [0] in Method = " + arr[0]);
    }

    public static void variableChange(int variable){
        variable = variable * variable;
        System.out.println("Variable in Method variableChange -> " + variable);
    }

    public static void printArray2(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array " + "[" + i + "]" + " = " + array[i]);
        }
        System.out.println("Array length " + array.length);
    }

    // Random array.
    public static void fillArray(int[] array,int min,int max){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (min + Math.random()*(max + 1 - min));
        }
    }

    public static void printArray(int[] array){   // Method print on console elements of array.
        for (int i = 0; i < array.length; i++) {  // i -> it is Index from 0 < end of array
            System.out.print(array[i] + " ");     //
        }
        System.out.println();
    }
}