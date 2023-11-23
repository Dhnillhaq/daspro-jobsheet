import java.security.Key;
import java.util.Scanner;

import javax.security.auth.kerberos.KerberosTicket;

public class NilaiMhs{
    
    static void inputNilai() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Banyak siswa: ");
        int banyak = sc.nextInt();
        System.out.print("Banyak hari: ");
        int hari= sc.nextInt();
        sc.nextLine();
        String[] Nama = new String[banyak];
        int[][] Nilai = new int [banyak][hari];
        for (int i = 0; i < Nama.length; i++) {
            System.out.print("Masukkan Nama Mahasiswa: ");
            Nama[i]=sc.nextLine();
            for (int j = 0; j < Nilai[i].length; j++) {
                System.out.print("Masukkan Nilai Mahasiswa Minggu ke-"+(j+1)+" : ");
                Nilai[i][j]=sc.nextInt();
            }
            sc.nextLine();
        }
        Show( Nama, Nilai);
    }

    static void Show(String Nama[], int Nilai[][]){
        for (int i = 0; i < Nama.length; i++) {
            System.out.print(Nama[i]+" : " );
            for (int j = 0; j < Nilai[i].length; j++) {
                System.out.print(Nilai[i][j]+" ");
            }
            System.out.println();
        }
        find(Nama, Nilai);
    }

    static void find(String Nama[], int Nilai[][]){
        int Key= 0, Day=0, highScore=0;
        for (int i = 0; i < Nilai.length; i++) {
            for (int j = 0; j < Nilai[i].length; j++) {
                if (highScore<Nilai[i][j]) {
                    highScore=Nilai[i][j];
                    Key = i;
                    Day = j;
                }
            }
        }
        System.out.println("Nilai tertinggi berada pada minggu ke-"+(Day+1));
        Smorts(Nama, Key);
    }

    static void Smorts(String Nama[],int Key){
        System.out.println("Anak terpandai adalah "+Nama[Key]);
    }

    public static void main(String[] args) {
        inputNilai();
    }
}