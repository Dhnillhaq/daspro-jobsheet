import java.util.Scanner;

public class PenjumlahanRekursif {
    static int hasil = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan yang akan dijumlahkan: ");
        int n = sc.nextInt();
        int i = 1;
        jumlah(i, n);
        System.out.print(" = "+hasil);
    }

    static int jumlah(int i, int n) {
        if (i == n) {
            System.out.print(i);
            hasil += i;
            return i;
        } else {
            System.out.print(i + " + ");
            hasil += i;
            return jumlah(i + 1, n);
        }
    }
}
