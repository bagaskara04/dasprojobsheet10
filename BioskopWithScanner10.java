import java.util.Scanner;

public class BioskopWithScanner10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        int baris, kolom;
        String nama, next, next1, perintah;
        String[][] penonton = new String[4][2];
        System.out.println("===== Bioskop Scanner =====");
        System.out.println("===========================");

        // While if
        // while (true) {
        // System.out.print("Masukkan nama : ");
        // nama = input10.nextLine();
        // System.out.print("Masukkan baris : ");
        // baris = input10.nextInt();
        // System.out.print("Masukkan kolom : ");
        // kolom = input10.nextInt();
        // input10.nextLine();

        // penonton[baris - 1][kolom - 1] = nama;

        // System.out.print("Input penonton lainnya? (y/exit): ");
        // next = input10.nextLine();

        // if (next.equalsIgnoreCase("exit")) {
        // break;
        // }
        // }
        // while (true) {
        // for (int i = 0; i < penonton.length; i++) {
        // System.out.println("Penonton baris ke- " + (i + 1) + ": " + String.join(", ",
        // penonton[i]));
        // }
        // System.out.print("Tampilkan daftar penonton? (y/exit): ");
        // next1 = input10.nextLine();

        // if (next.equalsIgnoreCase("exit")) {
        // System.out.println("Berhasil keluar");
        // break;
        // }
        // }

        // switchcase

        for (int i = 0; i < penonton.length; i++) {
            System.out.print("Masukkan perintah (input/tampilkan/exit) : ");
            perintah = input10.nextLine();
            switch (perintah) {
                case "input":
                    while (true) {
                        System.out.print("Masukkan nama : ");
                        nama = input10.nextLine();
                        System.out.print("Masukkan baris : ");
                        baris = input10.nextInt();
                        System.out.print("Masukkan kolom : ");
                        kolom = input10.nextInt();
                        input10.nextLine();

                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi telah diisi, silahkan pilih yang kosong");
                            continue;
                        }
                        penonton[baris - 1][kolom - 1] = nama;

                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = input10.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                case "tampilkan":
                    for (int j = 0; j < penonton.length; j++) {
                        for (int k = 0; k < penonton[j].length; k++) {
                            if (penonton[j][k] == null) {
                                penonton[j][k] = "***";
                            }
                        }
                        System.out.println("Penonton baris ke- " + (j + 1) + ": " + String.join(", ",
                                penonton[j]));
                    }
                    break;

                case "exit":
                    System.out.print("Yakin ingin keluar? (y/n) : ");
                    next1 = input10.nextLine();
                    if (next1.equalsIgnoreCase("y")) {
                        System.out.println("Berhasil keluar");
                        System.exit(0);
                    }
                    System.exit(0);
                    break;
            }
        }
    }
}