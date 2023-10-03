import java.util.Scanner;
public class Pemilihan2Percobaan2_18 {
    
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);
        int totalSudut, sudut1, sudut2, sudut3;
        System.out.println("Masukkan Sudut Pertama");
        sudut1 = input18.nextInt();
        System.out.println("Masukkan Sudut Kedua");
        sudut2 = input18.nextInt();
        System.out.println("Masukkan Sudut Ketiga");
        sudut3 = input18.nextInt();
        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga Siku-siku");
            else if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60)) 
                System.out.println("Segitiga sama sisi");
            else if ((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut2 == sudut3))
                System.out.println("Segitiga sama kaki");
            else
                System.out.println("Segitiga Sembarang");
                 
        } else
        System.out.println("Bukan Segitiga");
    }
}
