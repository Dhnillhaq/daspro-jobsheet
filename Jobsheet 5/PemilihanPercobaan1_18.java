   import java.util.Scanner;
   public class PemilihanPercobaan1_18 {

      public static void main(String[] args) {
            Scanner input18 = new Scanner (System.in);
            System.out.println("Masukkan angka: ");
            int angka = input18.nextInt();
            String output = (angka % 2 == 0) ? "Angka"+angka+" bilangan genap" : "Angka"+angka+" bilangan ganjil";
            System.out.println(output);
           

      }
   }