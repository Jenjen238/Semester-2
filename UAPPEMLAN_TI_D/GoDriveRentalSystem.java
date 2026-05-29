package UAPPEMLAN_TI_D;

import java.util.ArrayList;
import java.util.Scanner;

public class GoDriveRentalSystem {
    private ArrayList<Kendaraan> daftarKendaraan;

    public GoDriveRentalSystem() {
        this.daftarKendaraan = new ArrayList<>();
    }

    //  TAMBAH KENDARAAN 
    public void tambahKendaraan(Kendaraan k) {
        daftarKendaraan.add(k);
        System.out.println("[INFO] Kendaraan berhasil ditambahkan: " 
            + k.getNamaKendaraan() + " (" + k.getKodeKendaraan() + ")");
    }

    //  TAMPILKAN DAFTAR 
    public void tampilkanDaftarKendaraan() {
        if (daftarKendaraan.isEmpty()) {
            System.out.println("[INFO] Belum ada kendaraan dalam sistem.");
            return;
        }

        System.out.println("\n=== DAFTAR ARMADA GODRIVE ===");
        int nomor = 1;
        for (Kendaraan k : daftarKendaraan) {
            String status = k.getIsTersedia() ? "Tersedia" : "Tidak Tersedia";

            if (k instanceof Mobil) {
                Mobil m = (Mobil) k;
                System.out.printf("%d. [MOBIL] Kode: %-6s | Nama: %-20s | Kursi: %d | Tarif: Rp%,.0f/hari | Status: %s%n",
                    nomor, m.getKodeKendaraan(), m.getNamaKendaraan(),
                    m.getJumlahKursi(), m.getHargaSewaperHari(), status);
            } else if (k instanceof Motor) {
                Motor mt = (Motor) k;
                System.out.printf("%d. [MOTOR] Kode: %-6s | Nama: %-20s | Transmisi: %-6s | Tarif: Rp%,.0f/hari | Status: %s%n",
                    nomor, mt.getKodeKendaraan(), mt.getNamaKendaraan(),
                    mt.getJenisTransmisi(), mt.getHargaSewaperHari(), status);
            }
            nomor++;
        }
    }

    // SEWA KENDARAAN
    public void sewaKendaraan(String kode, int lamaSewa, boolean isVIP) 
            throws KendaraanTidakTersediaException {

        Kendaraan kendaraan = cariKendaraan(kode);

        // Lempar exception jika tidak ditemukan atau tidak tersedia
        if (kendaraan == null || !kendaraan.getIsTersedia()) {
            throw new KendaraanTidakTersediaException(
                "Kendaraan dengan kode " + kode + 
                " gagal disewa. Alasan: Kendaraan sedang disewa atau tidak ditemukan!"
            );
        }

        // Hitung biaya dasar
        double biayaDasar = lamaSewa * kendaraan.getHargaSewaperHari();
        double tambahan   = 0;
        double diskon     = 0;

        // Tambahan biaya khusus
        if (kendaraan instanceof Mobil) {
            Mobil m = (Mobil) kendaraan;
            if (m.getJumlahKursi() > 5) {
                tambahan = 50000;
            }
        } else if (kendaraan instanceof Motor) {
            Motor mt = (Motor) kendaraan;
            if (mt.getJenisTransmisi().equalsIgnoreCase("matik")) {
                tambahan = 10000 * lamaSewa;
            }
        }

        double subtotal = biayaDasar + tambahan;

        // Diskon VIP 10%
        if (isVIP) {
            diskon = subtotal * 0.10;
        }

        // Diskon tambahan > 7 hari 10%
        if (lamaSewa > 7) {
            diskon += subtotal * 0.10;
        }

        double totalAkhir = subtotal - diskon;

        // Ubah status kendaraan
        kendaraan.setIsTersedia(false);

        // Tampilkan detail transaksi
        System.out.println("\n=== TRANSAKSI SEWA GODRIVE ===");
        System.out.println("Kendaraan Berhasil Disewa!");
        System.out.printf("Unit       : %s (%s)%n", 
            kendaraan.getNamaKendaraan(), kendaraan.getKodeKendaraan());
        System.out.printf("Lama Sewa  : %d hari%n", lamaSewa);
        System.out.printf("Biaya Dasar Harian : Rp%,.0f%n", biayaDasar);

        if (kendaraan instanceof Mobil && ((Mobil) kendaraan).getJumlahKursi() > 5) {
            System.out.printf("Tambahan Kursi (>5): Rp%,.0f%n", tambahan);
        } else if (kendaraan instanceof Motor && 
            ((Motor) kendaraan).getJenisTransmisi().equalsIgnoreCase("matik")) {
            System.out.printf("Tambahan Asuransi Matik: Rp%,.0f%n", tambahan);
        }

        if (isVIP) {
            System.out.printf("Diskon Member VIP (10%%): -Rp%,.0f%n", subtotal * 0.10);
        }
        if (lamaSewa > 7) {
            System.out.printf("Diskon Sewa > 7 Hari (10%%): -Rp%,.0f%n", subtotal * 0.10);
        }

        System.out.println("------------------------------------------");
        System.out.printf("TOTAL BIAYA AKHIR: Rp%,.0f%n", totalAkhir);
    }

    // KEMBALIKAN KENDARAAN 
    public void kembalikanKendaraan(String kode) throws KendaraanTidakTersediaException {
        Kendaraan kendaraan = cariKendaraan(kode);

        if (kendaraan == null) {
            throw new KendaraanTidakTersediaException(
                "Kendaraan dengan kode [" + kode + "] tidak ditemukan dalam sistem."
            );
        }
        if (kendaraan.getIsTersedia()) {
            throw new KendaraanTidakTersediaException(
                "Kendaraan [" + kode + "] tidak sedang dalam proses penyewaan."
            );
        }

        kendaraan.setIsTersedia(true);
        System.out.println("[INFO] Kendaraan " + kendaraan.getNamaKendaraan() + 
            " (" + kode + ") berhasil dikembalikan. Status: Tersedia.");
    }

    // CARI KENDARAAN
    private Kendaraan cariKendaraan(String kode) {
        for (Kendaraan k : daftarKendaraan) {
            if (k.getKodeKendaraan().equalsIgnoreCase(kode)) {
                return k;
            }
        }
        return null;
    }

    // MAIN MENU
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GoDriveRentalSystem sistem = new GoDriveRentalSystem();

        // Data Dubby
        Mobil m1 = new Mobil("MBL01", "Toyota Avanza", 350000, 7);   m1.setIsTersedia(true);
        Mobil m2 = new Mobil("MBL02", "Daihatsu Sigra", 300000, 7);  m2.setIsTersedia(true);
        Mobil m3 = new Mobil("MBL03", "Honda Brio", 280000, 5);      m3.setIsTersedia(true);
        Motor mt1 = new Motor("MTR01", "Honda Vario", 80000, "matik");   mt1.setIsTersedia(true);
        Motor mt2 = new Motor("MTR02", "Yamaha NMAX", 100000, "matik");  mt2.setIsTersedia(true);
        Motor mt3 = new Motor("MTR03", "Kawasaki KLX", 90000, "manual"); mt3.setIsTersedia(true);

        sistem.daftarKendaraan.add(m1);
        sistem.daftarKendaraan.add(m2);
        sistem.daftarKendaraan.add(m3);
        sistem.daftarKendaraan.add(mt1);
        sistem.daftarKendaraan.add(mt2);
        sistem.daftarKendaraan.add(mt3);

        boolean running = true;
        while (running) {
            System.out.println("\n====== MENU GO DRIVE RENTAL SYSTEM ======");
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Tampilkan Daftar Armada");
            System.out.println("3. Sewa Kendaraan");
            System.out.println("4. Kembalikan Kendaraan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan;
            try {
                pilihan = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("[ERROR] Input tidak valid, masukkan angka 1-5.");
                continue;
            }

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jenis kendaraan (mobil/motor): ");
                    String jenis = sc.nextLine().trim().toLowerCase();
                    System.out.print("Masukkan kode kendaraan: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan nama kendaraan: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan harga sewa per hari: ");
                    double harga = Double.parseDouble(sc.nextLine().trim());

                    if (jenis.equals("mobil")) {
                        System.out.print("Masukkan kapasitas kursi: ");
                        int kursi = Integer.parseInt(sc.nextLine().trim());
                        Mobil mobilBaru = new Mobil(kode, nama, harga, kursi);
                        mobilBaru.setIsTersedia(true);
                        sistem.tambahKendaraan(mobilBaru);
                    } else if (jenis.equals("motor")) {
                        System.out.print("Masukkan jenis transmisi (matik/manual): ");
                        String transmisi = sc.nextLine();
                        Motor motorBaru = new Motor(kode, nama, harga, transmisi);
                        motorBaru.setIsTersedia(true);
                        sistem.tambahKendaraan(motorBaru);
                    } else {
                        System.out.println("[ERROR] Jenis kendaraan tidak dikenali.");
                    }
                    break;

                case 2:
                    sistem.tampilkanDaftarKendaraan();
                    break;

                case 3:
                    System.out.print("Masukkan kode kendaraan yang ingin disewa: ");
                    String kodeSewa = sc.nextLine();
                    System.out.print("Masukkan durasi sewa (dalam hari): ");
                    int lamaSewa = Integer.parseInt(sc.nextLine().trim());
                    System.out.print("Apakah Anda Member VIP? (y/n): ");
                    boolean isVIP = sc.nextLine().trim().equalsIgnoreCase("y");

                    try {
                        sistem.sewaKendaraan(kodeSewa, lamaSewa, isVIP);
                    } catch (KendaraanTidakTersediaException e) {
                        throw new RuntimeException(e); // Lempar ke atas sesuai contoh image
                    }
                    break;

                case 4:
                    System.out.print("Masukkan kode kendaraan yang ingin dikembalikan: ");
                    String kodeKembali = sc.nextLine();
                    try {
                        sistem.kembalikanKendaraan(kodeKembali);
                    } catch (KendaraanTidakTersediaException e) {
                        System.out.println("[ERROR] " + e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan Go-Drive Rental!");
                    running = false;
                    break;

                default:
                    System.out.println("[ERROR] Pilihan tidak valid.");
            }
        }
        sc.close();
    }
}