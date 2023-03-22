public class Arrays2 {
    public static void main(String[] args) {



        int count = 0;
        for (int i = 2; i <= 20; i+=2) {
            System.out.println(i);
            count++;
        }
        System.out.println("We have " + count + " Elements");

        System.out.println("------------------------");
        int[] myNumbers = new int[count];
        System.out.println(myNumbers.length);

        System.out.println("-------------------------");
        System.out.println(myNumbers[5]);

        System.out.println("-------------------------");
        // myNumbers[0] = 2;
        // myNumbers[1] = 4;
        // myNumbers[3] = 6;
        // myNumbers[4] = 8;
        // myNumbers[5] = 10;

        int index = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0){
                System.out.print(index + " ");
                //System.out.println(i);
                myNumbers[index] = i;
                System.out.println(myNumbers[index]);
                index++;
            }
        }

        System.out.println("-----------Final--------------");
        for (int i = 0; i < myNumbers.length; i++) {
                System.out.println(myNumbers[i]);
            }
        }
    }

