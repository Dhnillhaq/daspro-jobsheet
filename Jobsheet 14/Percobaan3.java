    import java.util.Scanner;

    public class Percobaan3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int saldoAwal, tahun;
            System.out.print("Jumlah saldo awal: ");
            saldoAwal = sc.nextInt(); 
            System.out.print("Lamanya investasi tahun: ");
            tahun = sc.nextInt();
            System.out.print("Jumlah saldo setelah "+ tahun + " tahun : ");
            System.out.print(hitungLaba(saldoAwal, tahun));
        }
        static double hitungLaba(double saldoInvestor, int lamaInvestasi){
            if (lamaInvestasi == 0) {
                return (saldoInvestor);
            } else {
                return (1.11 * hitungLaba(saldoInvestor, lamaInvestasi-1));
            }
        }
    }
