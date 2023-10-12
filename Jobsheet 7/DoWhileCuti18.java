import java.util.Scanner;

public class DoWhileCuti18 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;
        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();

         do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();
            
            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();
                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Jumlah hari yang anda masukkan lebih besar dari jatah cuti");
                    System.out.println("Silahkan pilih kembali jumlah hari cuti yang anda inginkan");
                    
                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                System.out.println("Yaudah");
                break;
            }
        } while (jatahCuti > 0);
    }
}
