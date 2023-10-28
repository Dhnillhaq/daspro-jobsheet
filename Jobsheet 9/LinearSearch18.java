import java.util.Scanner;

public class LinearSearch18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength;
        int key;
        int hasil = -1;
        System.out.print("Masukkan Jumlah Element: ");
        arrayLength = sc.nextInt();
        int[] arrayInt = new int[arrayLength];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan nilai element ke- " + (i + 1) + " : ");
            arrayInt[i] = sc.nextInt();
        }
        System.out.print("Masukkan key yang ingin anda cari: ");
        key = sc.nextInt();
        for (int j = 0; j < arrayInt.length; j++) {
            if (arrayInt[j] == key) {
                hasil = j;
                System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
                break;
            } 
        }
        if (hasil == -1) {
            System.out.println("Key tidak ditemukan");
        }
    }
}