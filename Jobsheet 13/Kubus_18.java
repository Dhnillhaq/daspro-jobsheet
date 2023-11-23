import java.util.Scanner;

public class Kubus_18 {
    static void Volume(int s){
        int vol = s*s*s;
        System.out.println("Volume Kubusnya adalah : "+vol);
    }
    static void LuasPermukaan(int s){
        int luasPermukaan=s*s*6;
        System.out.println("Luas permukaan kubusnya adalah : "+luasPermukaan);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubusnya : ");
        int sisi=sc.nextInt();
        Volume(sisi);
        LuasPermukaan(sisi);
    }
}