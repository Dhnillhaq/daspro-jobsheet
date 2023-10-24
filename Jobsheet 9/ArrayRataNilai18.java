import java.util.Scanner;

public class ArrayRataNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pjgArray;
        int counter1 = 0;
        int counter2 = 0;
        double totalLulus = 0;
        double totalTdkLulus = 0;
        double rata2Lulus;
        double rata2TdkLulus;
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        pjgArray = sc.nextInt();
        int[] nilaiMhs = new int[pjgArray];
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                counter1++;
                totalLulus += nilaiMhs[i];
            } else {
                counter2++;
                totalTdkLulus += nilaiMhs[i];
            }
        }
        rata2Lulus = totalLulus / counter1;
        rata2TdkLulus = totalTdkLulus / counter2;
        System.out.println("Banyaknya Mahasiswa yang lulus adalah " + counter1);
        System.out.println("Rata-rata nilai lulus= " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus= " + rata2TdkLulus);
    }
}
