import java.util.Scanner;
public class SquareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Masukkan panjang sisi persegi: ");
        N =sc.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j =0; j < N ; j++) {
                if (j == N - 1 || i == N -1 || i == 0 || j == 0) {
                    System.out.print(N);
                    System.out.print(" ");
                } else {
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
