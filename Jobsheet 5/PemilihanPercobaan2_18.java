import java.util.Scanner;
public class PemilihanPercobaan2_18 {
    
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);
        System.out.print("Nilai uas       : ");
        float uas= input18.nextFloat();
        System.out.print("Nilai uts       : ");
        float uts = input18.nextFloat();
        System.out.print("Nilai kuis      : ");
        float kuis = input18.nextFloat();
        System.out.print("Nilai tugas     : ");
        float tugas = input18.nextFloat();
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        
        String message = total < 65 ? "Remidi" : "Tidak Remidi";
        System.out.println("Nilai akhir anda"+total+"sehingga anda"+message);
        if (total > 80 && total <= 100) {
            System.out.println("Nilai Huruf anda A dengan Nilai Setara 4 dan Kualifikasi Sangat Baik");
        } else if (total > 73 && total <= 80) {
            System.out.println("Nilai Huruf anda B+ dengan Nilai Setara 3.5 dan Kualifikasi Lebih dari Baik");
        } else if (total > 65 && total <= 73) {
            System.out.println("Nilai Huruf anda B dengan Nilai Setara 3 dan Kualifikasi Baik");
        } else if (total > 60 && total <= 65) {
            System.out.println("Nilai Huruf anda C+ dengan Nilai Setara 2.5 dan Kualifikasi Lebih dari Cukup");
        } else if (total > 50 && total <= 60) {
            System.out.println("Nilai Huruf anda C dengan Nilai Setara 2 dan Kualifikasi Cukup");
        } else if (total > 30 && total <= 50) {
            System.out.println("Nilai Huruf anda D dengan Nilai Setara 1 dan Kualifikasi Kurang");
        } else if (total >= 39) {
            System.out.println("Nilai Huruf anda E dengan Nilai Setara 0 dan Kualifikasi Gagal");
        } else {
            System.out.println("Error");
        }
    }
}
