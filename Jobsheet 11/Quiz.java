import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak Angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                if (answer > number) {
                    System.out.println("Tebakan anda lebih besar dari kuncinya. hehe");
                    System.out.println("Coba lagi maszeh\n");
                }
                if (answer < number) {
                    System.out.println("Tebakan anda lebih kecil dari kuncinya. ish ish");
                    System.out.println("Coba lagi maszeh\n");
                }
                success = (answer == number);
            } while (!success);
            System.out.print("Yeay!!, anda berhasil menebak angkanya anjay");
            System.out.print("\nApakah Anda ingin mengulang permainan(Y/y)?");
            menu = input.nextLine().charAt(0);
        } while (menu == 'Y' || menu == 'y');
    }
}