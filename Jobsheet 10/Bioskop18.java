public class Bioskop18 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("panjang baris ke-" + (i+1)+" : "+penonton[i].length);
        }
        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);
    }
} 