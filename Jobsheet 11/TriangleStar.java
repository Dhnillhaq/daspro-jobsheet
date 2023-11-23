import java.util.Scanner;

public class TriangleStar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        boolean panjang = false;
        do {
            System.out.print("Masukkan nilai panjang N : ");
            N = input.nextInt();
            if (N > 4) {
                panjang = true;
            } else {
                System.out.println("\n[!!! Mohon input nilai N lebih dari 5 !!!]\n");
                panjang = false;
            }
        } while (!panjang);
        for (int i = N; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
