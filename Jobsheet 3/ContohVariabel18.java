public class ContohVariabel18 {

    public static void main(String[] args) {
        String hobby_Saya = "Bermain petak umpet";
        boolean is_Pandai_Saya = true;
        char jenis_Kelamin_Saya = 'L';
        byte umur_Saya_Sekarang = 20;
        double $ipk_Saya = 3.24, tinggi_Saya = 1.78;
        System.out.println(hobby_Saya);
        System.out.println("Apakah pandai? " + is_Pandai_Saya);
        System.out.println("Jenis Kelamin: " + jenis_Kelamin_Saya);
        System.out.println("Umurku saat ini: " + umur_Saya_Sekarang);
        System.out.println(String.format("Saya beripk %s, 1dengan tinggi badan%s", $ipk_Saya, tinggi_Saya));
    }
}