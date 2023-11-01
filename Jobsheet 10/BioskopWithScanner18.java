import java.util.Scanner;

public class BioskopWithScanner18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;
        String[][] penonton = new String[4][2];
        do {
            System.out.println("Pilih Menu yang ingin anda lakukan:");
            System.out.println("1]. Input Data Penonton");
            System.out.println("2]. Tampilkan Daftar Penonton");
            System.out.println("3]. Exit");
            System.out.print("$> ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    while (true) {
                        // sc.nextLine();
                        System.out.print("Masukkan nama: ");
                        nama = sc.next();
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();
                        if (baris > penonton.length || kolom > penonton[0].length) {
                            System.out.println("\nBaris/Kolom tidak tersedia\n");
                            continue;
                        }
                        
                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("\nBaris/Kolom ini telah terisi\n");
                            continue;
                        } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        }
                            System.out.print("\nInput penonton lainnya? (y/n): ");
                            next = sc.nextLine();
                            if (next.equalsIgnoreCase("n")) {
                                break;
                            }
                    }
                    break;
                case 2:
                    System.out.println("Menampilkan Daftar Penonton");
                    for (int i = 0; i < penonton.length ; i++) {
                        for (int j = 0; j < penonton[0].length; j++) {
                            if (penonton[i][j] == null) {
                            penonton[i][j] = "***";
                        }
                        }
                    System.out.println(String.join("\t ", penonton[i]));
                    }
                    break;
                default:
                    System.out.println("Anda Keluar Dari Program");
                    System.out.println("Datang Kembali");
                    return;

            }
            System.out.print("Apakah anda ingin kembali ke menu? (y/n): ");
            next = sc.next();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        } while (true);
    }
}