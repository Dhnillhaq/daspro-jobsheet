import java.util.Scanner;

public class PrimaRekursif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Masukkan Bilangan yang anda ingin check: ");
        n = sc.nextInt();
        int f = 21;
        prima(n, f);
    }
    static void prima(int n, int f){
        if (n == 1) {
            System.out.print("bukan bilangan prima");
        } else if (f == n) {
            System.out.print("bilangan prima");
        } else {
            if (n % f != 0) {
                prima(n, f + 1);
            } else {
                System.out.print("bukan bilangan prima");
            }
        }
    }
}
