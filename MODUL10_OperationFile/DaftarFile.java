package MODUL10_OperationFile;

import java.io.File;

public class DaftarFile {
    public static void main(String[] args) {

        // Menentukan lokasi direktori
        File direktori = new File("Contoh");

        // Mengecek apakah direktori ada
        if (direktori.exists() && direktori.isDirectory()) {

            // Mengambil semua file dalam direktori
            File[] daftarFile = direktori.listFiles();

            System.out.println("Daftar file dalam direktori:");

            // Perulangan untuk menampilkan nama file
            for (File file : daftarFile) {
                System.out.println(file.getName());
            }

        } else {
            System.out.println("Direktori tidak ditemukan!");
        }
    }
}
