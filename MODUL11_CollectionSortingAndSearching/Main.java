package MODUL11_CollectionSortingAndSearching;
public class Main {
    public static void main(String[] args) {
        Tim timA = new Tim("Tim A");
        Tim timB = new Tim("Tim B");

        // Data Tim A
        timA.tambahPemain(new Pemain(1,168,50));
        timA.tambahPemain(new Pemain(2,170,60));
        timA.tambahPemain(new Pemain(3,165,56));
        timA.tambahPemain(new Pemain(4,168,55));
        timA.tambahPemain(new Pemain(5,172,60));
        timA.tambahPemain(new Pemain(6,170,70));
        timA.tambahPemain(new Pemain(7,169,66));
        timA.tambahPemain(new Pemain(8,165,56));
        timA.tambahPemain(new Pemain(9,171,72));
        timA.tambahPemain(new Pemain(10,166,56));

        // Data Tim B
        timB.tambahPemain(new Pemain(1,170,66));
        timB.tambahPemain(new Pemain(2,167,60));
        timB.tambahPemain(new Pemain(3,165,59));
        timB.tambahPemain(new Pemain(4,166,58));
        timB.tambahPemain(new Pemain(5,168,58));
        timB.tambahPemain(new Pemain(6,175,71));
        timB.tambahPemain(new Pemain(7,172,68));
        timB.tambahPemain(new Pemain(8,171,68));
        timB.tambahPemain(new Pemain(9,168,65));
        timB.tambahPemain(new Pemain(10,169,60));

        // Tampilkan data awal
        timA.tampilkanData();
        timB.tampilkanData();

        // =============================
        // 1A Sorting Tinggi
        // =============================

        System.out.println("\n=== TIM A Tinggi Ascending ===");
        timA.sortTinggiAsc();
        timA.tampilkanData();

        System.out.println("\n=== TIM A Tinggi Descending ===");
        timA.sortTinggiDesc();
        timA.tampilkanData();

        // =============================
        // 1B Sorting Berat
        // =============================

        System.out.println("\n=== TIM B Berat Ascending ===");
        timB.sortBeratAsc();
        timB.tampilkanData();

        System.out.println("\n=== TIM B Berat Descending ===");
        timB.sortBeratDesc();
        timB.tampilkanData();

        // =============================
        // 1C Min dan Max
        // =============================

        System.out.println("\n=== MIN MAX TIM A ===");
        System.out.println("Tinggi Max : " + timA.maxTinggi());
        System.out.println("Tinggi Min : " + timA.minTinggi());
        System.out.println("Berat Max  : " + timA.maxBerat());
        System.out.println("Berat Min  : " + timA.minBerat());

        System.out.println("\n=== MIN MAX TIM B ===");
        System.out.println("Tinggi Max : " + timB.maxTinggi());
        System.out.println("Tinggi Min : " + timB.minTinggi());
        System.out.println("Berat Max  : " + timB.maxBerat());
        System.out.println("Berat Min  : " + timB.minBerat());

        // =============================
        // 1D Copy Tim B ke Tim C
        // =============================

        Tim timC = timB.copyTim("Tim C");
        System.out.println("\n=== TIM C (COPY DARI TIM B) ===");
        timC.tampilkanData();

        // =============================
        // 2B Binary Search Tim B
        // =============================

        System.out.println("\n=== Binary Search Tinggi Tim B ===");

        int jumlah168 = BinarySearch.jumlahData(
                timB.getDaftarTinggi(), 168);
        int jumlah160 = BinarySearch.jumlahData(
                timB.getDaftarTinggi(), 160);

        System.out.println("Jumlah tinggi 168 cm : " + jumlah168);
        System.out.println("Jumlah tinggi 160 cm : " + jumlah160);

        // =============================
        // 2C Binary Search Tim A
        // =============================

        System.out.println("\n=== Binary Search Berat Tim A ===");

        int jumlah56 = BinarySearch.jumlahData(
                timA.getDaftarBerat(), 56);

        int jumlah53 = BinarySearch.jumlahData(
                timA.getDaftarBerat(), 53);

        System.out.println("Jumlah berat 56 kg : " + jumlah56);
        System.out.println("Jumlah berat 53 kg : " + jumlah53);

        // =============================
        // 2D Cek Kesamaan Tim A dan Tim B
        // =============================

        boolean sama = false;

        for (Integer tinggi : timA.getDaftarTinggi()) {
            if (BinarySearch.cariData(timB.getDaftarTinggi(), tinggi)) {
                sama = true;
                break;
            }
        }
        if (sama) {
            System.out.println("\nAda tinggi/berat yang sama antara Tim A dan Tim B");
        } else {
            System.out.println("\nTidak ada data yang sama");
        }
    }
}