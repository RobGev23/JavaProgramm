public class Array3 {
    public static void main(String[] args) {


        String[] patients = new String[30];

        for (int i = 0; i < 30; i++) {
            patients[i] = "Patient " + (i+1);
            System.out.println(patients[i]);
        }

    }
}
