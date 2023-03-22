public class HomeWork {
    public static void main(String[] args) {
        /*
        Задание 1
        Создайте массив нечетных чисел от 1 до 97.
        После создания выведите все элементы массива в консоль. После чего выведите этот же массив, но в обратном порядке.
        */

        int count = 0;
        for (int i = 1; i <= 97; i+=2) {
            //System.out.println(i);
            count++;
        }
        //System.out.println(count);


        int[] oddNumbers = new int[count];
        oddNumbers[0] = 1;
        oddNumbers[1] = 3;
        oddNumbers[2] = 5;
        oddNumbers[3] = 7;


        int index = 0;
        for (int i = 0; i <= 97; i++) {
            if (i % 2 != 0){
                //System.out.println(i);
                oddNumbers[index] = i;
                //System.out.println(oddNumbers[index]);
                index++;
            }
        }

        for (int i = 0; i < oddNumbers.length; i++) {
            System.out.println(oddNumbers[i]);
        }

        System.out.println("--------------------------");

        for (int i = oddNumbers.length-1; i >= 0 ; i--) {
            System.out.println(oddNumbers[i]);
        }




         /*
        Задание 2
        Создайте массив из строк (String), выведите его в консоль. Элементы массив сделайте по образцу:
        {"Step 75", "Step 74", "Step 73",..., "Step 10", "Step 9"} (Числа от 75 до 9 включительно).
         */

        System.out.println("-------------------------------");

        String[] addWords = new String[75];
        for (int i = 9; i <= 75 ; i++) {
            System.out.println("Step " +  i  );
        }





    }
}
