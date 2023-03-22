public class Main {
    public static void main(String[] args) {

        int[] arr1 = new int[20];
        printArray(arr1);
        fillArray(arr1,-100,100);
        printArray(arr1);

        System.out.println("--------------------------");
        int indexResult = search(arr1,12);
        System.out.println("Index is " + indexResult);

        System.out.println("--------------------------");
        int maxDigitInArray = maxDigitInArray(arr1);
        System.out.println("Max digit " + maxDigitInArray );
    }

    // Find max number in Array.
    public static int maxDigitInArray(int[] array){
        int res = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > res){
                res = array[i];
            }
        }
        return res;
    }

    //Proiti po massivy ,naiti zadannoe chislo i vernut ego index.
    public static int search(int[] array,int number){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {  // esli tekushaa iacheika massiva ravna zadannomy chislu.
                return i;                // vozvrashaem index - iacheiku v kotorom legit eto znachenie.
            }
        }
            return -1;                   // esli ne nashol vivodit -1.
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
        System.out.println("----------------------------------");
    }
}