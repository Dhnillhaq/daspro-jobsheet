import java.util.Scanner;

public class Gaji18 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int jmlMasuk, JmlTdkMasuk, gaji, potGaji, TotGaji;
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda");
        JmlTdkMasuk=input.nextInt();
        System.out.println("Masukkan besar gaji anda perhari");
        gaji=input.nextInt();
        System.out.println("Masukkan besar potongan gaji anda perhari tidak masuk");
        potGaji=input.nextInt();
        TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah" +TotGaji);

    }
}
