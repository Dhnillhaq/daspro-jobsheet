import java.util.Scanner;

public class HargaBayar18 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int JmlHalBuku, harga,jumlah;
        double dis, total, bayar, jmlDis;
        String merk;
        System.out.println("Masukkan merk buku");
        merk = input.nextLine();
        System.out.println("Masukkan Jumlah Halaman Buku");
        JmlHalBuku = input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli");
        harga = input.nextInt();
        System.out.println("Masukkan Jumlah barang yang dibeli");
        jumlah=input.nextInt();
        System.out.println("Masukkan besar diskon");
        dis = input.nextDouble();
        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        System.out.println("Diskon yang anda dapatkan adalah "+ jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah "+ bayar);
        System.out.println("Merk buku yang dibeli adalah " + merk);
        System.out.println("Jumlah Halaman Buku" +JmlHalBuku);
    }
}
