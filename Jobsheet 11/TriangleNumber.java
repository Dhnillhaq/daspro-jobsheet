import java.util.Scanner;

public class TriangleNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int N;
        boolean panjang = false;
        do {
            System.out.print("Masukkan panjang segitiga lebih dari 2 baris: ");
            N = input.nextInt();
            if (N > 2) {
                panjang = true;
            } else {
            System.out.println("\n[!!! Mohon input nilai N lebih dari 2 !!!]\n");
            panjang = false;
            }
        } while (!panjang);
        for (int i = N; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= N - i; k++) {
                System.out.print(number[k]);
            }
            System.out.println();
        }
    }
}