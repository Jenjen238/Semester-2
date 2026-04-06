package TinyStore;

public class Main {

public static void main(String[] args){

        SistemTiny toko =
                new SistemTiny();

        Pelanggan p1 =
                new Pelanggan(
                        "5600000001",
                        "Budi",
                        2000000,
                        "1234");

        toko.tambahPelanggan(p1);

        Pelanggan pelanggan =
                toko.cariPelanggan(
                        "5600000001");

        System.out.println(
                "Saldo awal : "
                + pelanggan.getSaldo());

        boolean transaksi1 =
                pelanggan.beli(
                        1200000,
                        "1234");

        System.out.println(
                "Pembelian : "
                + transaksi1);

        System.out.println(
                "Saldo : "
                + pelanggan.getSaldo());

        boolean transaksi2 =
                pelanggan.topUp(
                        500000,
                        "1234");

        System.out.println(
                "Top up : "
                + transaksi2);

        System.out.println(
                "Saldo akhir : "
                + pelanggan.getSaldo());

        // simulasi blokir

        pelanggan.beli(1000,"0000");
        pelanggan.beli(1000,"0000");
        pelanggan.beli(1000,"0000");

        boolean transaksi3 =
                pelanggan.beli(
                        1000,
                        "1234");

        System.out.println(
                "Setelah diblokir : "
                + transaksi3);

        }

}