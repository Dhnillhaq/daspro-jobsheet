public class Fibonanci {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            System.out.println("Bulan ke- " + (i + 1) + ", berjumlah: " + fibonanci(i + 1) + " Pasangan");
        }
    }

    static int fibonanci(int n) {
        int fib;
        if (n <= 2) {
            fib = 1;
            return fib;
        } else {
            fib = fibonanci(n - 1) + fibonanci(n - 2);
            return fib;
        }
    }
}