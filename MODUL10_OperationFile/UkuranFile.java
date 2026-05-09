package MODUL10_OperationFile;

import java.io.File;
import java.text.DecimalFormat;

public class UkuranFile {
    public static void main(String[] args) {

        // Ganti dengan lokasi file yang ingin dicek
        File file = new File("test.txt");

        // Mengecek apakah file ada
        if (file.exists()) {

            // Ukuran file dalam byte
            long ukuranByte = file.length();

            // Konversi
            double ukuranKB = ukuranByte / 1024.0;
            double ukuranMB = ukuranByte / (1024.0 * 1024.0);

            DecimalFormat df = new DecimalFormat("#.##");

            // Jika ukuran < 1 MB tampilkan KB
            if (ukuranMB < 1) {
                System.out.println("Ukuran file: " + df.format(ukuranKB) + " KB");
            }
            // Jika ukuran >= 1 MB tampilkan MB
            else {
                System.out.println("Ukuran file: " + df.format(ukuranMB) + " MB");
            }

        } else {
            System.out.println("File tidak ditemukan!");
        }
    }
}
