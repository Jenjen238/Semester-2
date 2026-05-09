package MODUL10_OperationFile;

import java.io.File;

public class HapusDirektori {
    public static void main(String[] args) {

        // Menentukan direktori yang akan dihapus
        File direktori = new File("Contoh");

        // Mengecek apakah direktori ada
        if (direktori.exists() && direktori.isDirectory()) {

            // Mengambil semua file dalam direktori
            File[] daftarFile = direktori.listFiles();

            // Menghapus semua file
            for (File file : daftarFile) {
                if (file.isFile()) {
                    file.delete();
                    System.out.println("File dihapus: " + file.getName());
                }
            }

            // Menghapus direktori
            if (direktori.delete()) {
                System.out.println("Direktori berhasil dihapus.");
            } else {
                System.out.println("Direktori gagal dihapus.");
            }

        } else {
            System.out.println("Direktori tidak ditemukan!");
        }
    }
}
