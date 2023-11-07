import java.util.Scanner;

public class NestedLoop_2341720133 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] temps = new double[5][7];
        double[] rata2 = new double[5];
        double[] sum = new double[5];
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = input.nextDouble();
                sum[i] += temps[i][j];
                rata2[i] = sum[i] / 7;
            }
            System.out.println();
        }
        int i = 0;
        for (double[] baris : temps) {
            System.out.print("Kota ke-" + i + ": ");
            for (double suhu : baris) {
                System.out.print(suhu + " C ");
            }
            System.out.printf("\nDengan rata-rata perhari: %.2f - derajat Celcius", rata2[i]);
            System.out.println();
            i++;
        }
    }
}