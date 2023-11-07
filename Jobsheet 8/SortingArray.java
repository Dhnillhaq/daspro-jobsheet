import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bnykElement, temp;
        int nilaiSeluruhElmnt = 0;
        int counter = 0;
        double rata2;
        // User Input Banyaknya element
        System.out.print("\nMasukkan Banyak Element: ");
        bnykElement = sc.nextInt();
        int nilai[] = new int[bnykElement];
        System.out.println("");

        // User Input nilai setiap element
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai element ke- "+(i+1)+" : ");
            nilai[i] = sc.nextInt();
            nilaiSeluruhElmnt += nilai[i];
            counter++;
        }
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 1; j < nilai.length-i; j++) {
                if (nilai[j-1] < nilai[j]) {
                    temp = nilai[j-1];
                    nilai[j-1] = nilai[j];
                    nilai[j] = temp;
                }
            }
        }
        rata2 = nilaiSeluruhElmnt / counter;
        System.out.println("\n===========================================================================================\n");
        System.out.println("Nilai Tertinggi: "+nilai[0]);
        System.out.println("Nilai Terendah: "+nilai[bnykElement-1]);
        System.out.println("Nilai Rata-rata Seluruh Element"+rata2);
    }
}