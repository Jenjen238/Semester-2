public class PenjualanJaketLabkomdas {
    
    // Konstanta final untuk harga normal jaket (tidak bisa diubah)
    public static final double HARGA_A = 100000;
    public static final double HARGA_B = 125000;
    public static final double HARGA_C = 175000;
    
    // Konstanta final untuk harga diskon (tidak bisa diubah)
    public static final double DISKON_A = 95000;
    public static final double DISKON_B = 120000;
    public static final double DISKON_C = 160000;
    
    public static final int BATAS_DISKON = 100;
    
    public static double hitungHargaA(int jumlah) {
        if (jumlah > BATAS_DISKON) {
            return DISKON_A * jumlah;
        }
        return HARGA_A * jumlah;
    }
    
    public static double hitungHargaB(int jumlah) {
        if (jumlah > BATAS_DISKON) {
            return DISKON_B * jumlah;
        }
        return HARGA_B * jumlah;
    }
    
    
    public static double hitungHargaC(int jumlah) {
        if (jumlah > BATAS_DISKON) {
            return DISKON_C * jumlah;
        }
        return HARGA_C * jumlah;
    }
    
    // Method static untuk menghitung total pembelian campuran
    public static double hitungTotal(int jumlahA, int jumlahB, int jumlahC) {
        double totalA = hitungHargaA(jumlahA);
        double totalB = hitungHargaB(jumlahB);
        double totalC = hitungHargaC(jumlahC);
        return totalA + totalB + totalC;
    }
    
    // Method static untuk menampilkan informasi harga
    public static void tampilkanInfoHarga() {
        System.out.println("=== INFORMASI HARGA JAKET CV. LABKOMDAS ===");
        System.out.println("Harga Normal:");
        System.out.println("- Jaket A: Rp " + HARGA_A + " per buah");
        System.out.println("- Jaket B: Rp " + HARGA_B + " per buah");
        System.out.println("- Jaket C: Rp " + HARGA_C + " per buah");
        System.out.println("\nDiskon (min. 101 buah):");
        System.out.println("- Jaket A: Rp " + DISKON_A + " per buah");
        System.out.println("- Jaket B: Rp " + DISKON_B + " per buah");
        System.out.println("- Jaket C: Rp " + DISKON_C + " per buah");
        System.out.println("============================================");
    }
    
    // Method main untuk testing program
    public static void main(String[] args) {
        // Tampilkan informasi harga
        tampilkanInfoHarga();
        System.out.println();
        
        // Test case 1: Pembelian di bawah batas diskon
        System.out.println("=== TEST CASE 1: Pembelian < 100 buah ===");
        int jumlahA1 = 50;
        int jumlahB1 = 80;
        int jumlahC1 = 90;
        double total1 = hitungTotal(jumlahA1, jumlahB1, jumlahC1);
        System.out.printf("Jaket A (%d): Rp %.0f\n", jumlahA1, hitungHargaA(jumlahA1));
        System.out.printf("Jaket B (%d): Rp %.0f\n", jumlahB1, hitungHargaB(jumlahB1));
        System.out.printf("Jaket C (%d): Rp %.0f\n", jumlahC1, hitungHargaC(jumlahC1));
        System.out.printf("TOTAL: Rp %.0f\n\n", total1);
        
        // Test case 2: Pembelian di atas batas diskon
        System.out.println("=== TEST CASE 2: Pembelian > 100 buah ===");
        int jumlahA2 = 150;
        int jumlahB2 = 120;
        int jumlahC2 = 200;
        double total2 = hitungTotal(jumlahA2, jumlahB2, jumlahC2);
        System.out.printf("Jaket A (%d): Rp %.0f (DISKON!)\n", jumlahA2, hitungHargaA(jumlahA2));
        System.out.printf("Jaket B (%d): Rp %.0f (DISKON!)\n", jumlahB2, hitungHargaB(jumlahB2));
        System.out.printf("Jaket C (%d): Rp %.0f (DISKON!)\n", jumlahC2, hitungHargaC(jumlahC2));
        System.out.printf("TOTAL: Rp %.0f\n\n", total2);
        
        // Input dari user
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Masukkan jumlah Jaket A: ");
        int userA = input.nextInt();
        System.out.print("Masukkan jumlah Jaket B: ");
        int userB = input.nextInt();
        System.out.print("Masukkan jumlah Jaket C: ");
        int userC = input.nextInt();
        
        double totalUser = hitungTotal(userA, userB, userC);
        System.out.println("\n=== HASIL PEMBELIAN ANDA ===");
        System.out.printf("Jaket A (%d): Rp %.0f\n", userA, hitungHargaA(userA));
        System.out.printf("Jaket B (%d): Rp %.0f\n", userB, hitungHargaB(userB));
        System.out.printf("Jaket C (%d): Rp %.0f\n", userC, hitungHargaC(userC));
        System.out.printf("TOTAL PEMBELIAN: Rp %.0f\n", totalUser);
        input.close();
    }
}