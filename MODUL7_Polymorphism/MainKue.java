package MODUL7_Polymorphism;

public class MainKue {
    public static void main(String[] args) {
        Kue[] daftarKue = new Kue[20];

        daftarKue[0]  = new KuePesanan("Kue Lapis Legit", 150000, 1.5);
        daftarKue[1]  = new KuePesanan("Brownies Coklat", 80000, 2.0);
        daftarKue[2]  = new KuePesanan("Bolu Gulung", 60000, 1.0);
        daftarKue[3]  = new KuePesanan("Kue Tart Strawberry", 120000, 2.5);
        daftarKue[4]  = new KuePesanan("Red Velvet Cake", 200000, 1.8);
        daftarKue[5]  = new KuePesanan("Cheesecake", 180000, 1.2);
        daftarKue[6]  = new KuePesanan("Tiramisu", 175000, 1.0);
        daftarKue[7]  = new KuePesanan("Black Forest", 130000, 2.0);
        daftarKue[8]  = new KuePesanan("Kue Nastar Spesial", 90000, 3.0);
        daftarKue[9]  = new KuePesanan("Bolu Pandan", 70000, 1.5);

        daftarKue[10] = new KueJadi("Onde-onde", 2000, 20);
        daftarKue[11] = new KueJadi("Risoles Mayo", 3000, 15);
        daftarKue[12] = new KueJadi("Pastel Ayam", 3500, 10);
        daftarKue[13] = new KueJadi("Lemper Ayam", 2500, 25);
        daftarKue[14] = new KueJadi("Donat Gula", 4000, 12);
        daftarKue[15] = new KueJadi("Kue Cubit", 1500, 30);
        daftarKue[16] = new KueJadi("Klepon", 1000, 40);
        daftarKue[17] = new KueJadi("Serabi Bandung", 2000, 18);
        daftarKue[18] = new KueJadi("Pukis Coklat", 2500, 20);
        daftarKue[19] = new KueJadi("Bika Ambon", 5000, 10);

        // a. Tampilkan semua kue beserta jenis kuenya
        System.out.println("=".repeat(50));
        System.out.println("   a. DAFTAR SEMUA KUE   ");
        System.out.println("=".repeat(50));
        for (int i = 0; i < daftarKue.length; i++) {
            System.out.println("\nKue ke-" + (i + 1));
            if (daftarKue[i] instanceof InfoKue) {
                ((InfoKue) daftarKue[i]).tampilkanInfo();
            }
        }

        // b. Total harga dari semua jenis kue
        double totalHargaSemua = 0;
        for (Kue kue : daftarKue) {
            totalHargaSemua += kue.hitungHarga();
        }
        System.out.println("\n" + "=".repeat(50));
        System.out.println("   b. TOTAL HARGA SEMUA KUE   ");
        System.out.println("=".repeat(50));
        System.out.printf("Total Harga Semua Kue : Rp %.2f%n", totalHargaSemua);

        // c. Total harga dan total berat dari KuePesanan
        double totalHargaPesanan = 0;
        double totalBerat = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KuePesanan) {
                KuePesanan kp = (KuePesanan) kue;
                totalHargaPesanan += kp.hitungHarga();
                totalBerat += kp.getBerat();
            }
        }
        System.out.println("\n" + "=".repeat(50));
        System.out.println("   c. TOTAL KUE PESANAN   ");
        System.out.println("=".repeat(50));
        System.out.printf("Total Harga Kue Pesanan : Rp %.2f%n", totalHargaPesanan);
        System.out.printf("Total Berat Kue Pesanan : %.2f kg%n", totalBerat);

        // d. Total harga dan total jumlah dari KueJadi
        double totalHargaJadi = 0;
        double totalJumlah = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KueJadi) {
                KueJadi kj = (KueJadi) kue;
                totalHargaJadi += kj.hitungHarga();
                totalJumlah += kj.getJumlah();
            }
        }
        System.out.println("\n" + "=".repeat(50));
        System.out.println("   d. TOTAL KUE JADI   ");
        System.out.println("=".repeat(50));
        System.out.printf("Total Harga Kue Jadi : Rp %.2f%n", totalHargaJadi);
        System.out.printf("Total Jumlah Kue Jadi: %.0f buah%n", totalJumlah);

        // e. Kue dengan harga akhir terbesar
        Kue kueTerMahal = daftarKue[0];
        for (int i = 1; i < daftarKue.length; i++) {
            if (daftarKue[i].hitungHarga() > kueTerMahal.hitungHarga()) {
                kueTerMahal = daftarKue[i];
            }
        }
        System.out.println("\n" + "=".repeat(50));
        System.out.println("   e. KUE DENGAN HARGA TERBESAR   ");
        System.out.println("=".repeat(50));
        if (kueTerMahal instanceof InfoKue) {
            ((InfoKue) kueTerMahal).tampilkanInfo();
        }
    }
}
