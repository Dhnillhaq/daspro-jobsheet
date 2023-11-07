public class Bioskop18 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][];
        penonton[0] = new String[2];
        penonton[1] = new String[2];
        penonton[2] = new String[2];
        penonton[3] = new String[2];
        penonton [0][0] = "Amin";
        penonton [0][1] = "Bena";
        penonton [1][0] = "Candra";
        penonton [1][1] = "Dela";
        penonton [2][0] = "Eka";
        penonton [2][1] = "Farhan";
        penonton [3][0] = "Gisel";
        penonton [3][1] = "Asep";
        
        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: " + barisPenonton.length);
        }
        for (int i = 0; i < penonton.length; i++) {
            System.out.println( String.join(", ", penonton[i]));
        }
    }
} 