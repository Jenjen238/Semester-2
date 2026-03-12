package Perbankan;

public class Bank {
    public static void main(String[] args) {
        // Contoh inisialisasi: nomor rekening sebagai String (10 digit)
        Akun jenjen = new Akun("jenjen", "ASDEP92POL123_", 1_000_000, "1234567890");


        // coba deposit dengan password salah
        jenjen.setor(100_000, "salah_password"); // gagal

        // deposit benar
        jenjen.setor(100_000, "ASDEP92POL123_"); // berhasil

        // tarik uang lebih besar dari saldo
        jenjen.tarik(2_000_000, "ASDEP92POL123_"); // gagal: saldo tidak cukup

        // tarik uang valid
        jenjen.tarik(500_000, "ASDEP92POL123_"); // berhasil
    }
}