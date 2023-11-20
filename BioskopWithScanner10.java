import java.util.Scanner;

public class BioskopWithScanner10 {
   public static void main(String[] args) {
    Scanner input10 = new Scanner(System.in);
    int baris, kolom;
    String nama, next;
    String[][] penonton = new String[4][2];

    while (true) {
        System.out.print("Masukkan nama : ");
        nama = input10.nextLine();
        System.out.print("Masukkan baris : ");
        baris = input10.nextInt();
        System.out.print("Masukkan kolom : ");
        kolom = input10.nextInt();
        input10.nextLine();

        penonton[baris-1][kolom-1] = nama;

        System.out.print("Input penonton lainnya? (y/n): ");
        next = input10.nextLine();

        if (next.equalsIgnoreCase("n")) {
            break;
        }
    }
   } 
}
