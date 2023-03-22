public class StarsSquare {
    public static void main(String[] args) {

        starsSquare(7);

    }

    public static void starsSquare(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                if (i == 1 || j == 1 || i == side || j == side) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}

