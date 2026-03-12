package perpustakaan;

public class Buku {
    private final String judul;
    private final Penulis[] penulis;
    private final String kategori;
    private String sinopsis;
    private int jumlahTerjual;

    public Buku(String judul, Penulis[] penulis, String kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
    }
    public Buku(String judul, Penulis[] penulis, String kategori, String sinopsis) {
        this.judul    = judul;
        this.penulis  = penulis;
        this.kategori = kategori;
        this.sinopsis = sinopsis;
    }
    public Buku(String judul, Penulis[] penulis, String kategori, String sinopsis, int jumlahTerjual) {
        this.judul    = judul;
        this.penulis  = penulis;
        this.kategori = kategori;
        this.sinopsis = sinopsis;
        this.jumlahTerjual = jumlahTerjual;
    }

    public String getJudul() {
        return judul;
    }

    public Penulis[] getPenulis() {
        return penulis;
    }

    public String getKategori() {
        return kategori;
    }
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    public int hitungJumlahKata() {
        if (sinopsis == null || sinopsis.trim().isEmpty()) return 0;
        String[] kata = sinopsis.trim().split("\\s+");
        return kata.length;
    }
    public double cekKesamaan(Buku other) {
        int totalAtribut = 4; // judul, kategori, sinopsis, penulis
        double skor = 0;

        // Cek kesamaan judul
        if (this.judul.equalsIgnoreCase(other.judul))
            skor++;

        // Cek kesamaan kategori
        if (this.kategori.equalsIgnoreCase(other.kategori))
            skor++;

        // Cek kesamaan sinopsis
        if (this.sinopsis.equalsIgnoreCase(other.sinopsis))
            skor++;

        // Cek kesamaan penulis (minimal 1 nama sama)
        boolean adaPenulisSama = false;
        for (Penulis p1 : this.penulis) {
            for (Penulis p2 : other.penulis) {
                if (p1.getNama().equalsIgnoreCase(p2.getNama())) {
                    adaPenulisSama = true;
                    break;
                }
            }
        }
        if (adaPenulisSama) skor++;

        double persentase = (skor / totalAtribut) * 100;
        System.out.printf("Tingkat kesamaan '%s' dengan '%s' : %.1f%%%n",
                this.judul, other.judul, persentase);
        return persentase;
    }
    public Buku copy() {
        // Salin array penulis agar tidak shared reference
        Penulis[] salinanPenulis = new Penulis[this.penulis.length];
        for (int i = 0; i < this.penulis.length; i++) {
            salinanPenulis[i] = new Penulis(this.penulis[i].getNama());
        }
        return new Buku(this.judul, salinanPenulis, this.kategori, this.sinopsis);
    }
    // public double hitungRoyalti(double harga) {
    //     double totalPenjualan = harga * jumlahTerjual; // ← pakai attribute
    //     double royalti        = totalPenjualan * 0.10;
    //     return royalti;
    // }
    // public void displayInfo() {
    //     System.out.println("Judul    : " + judul);
    //     System.out.println("Kategori : " + kategori);
    //     System.out.print  ("Penulis  : ");
    //     for (Penulis p : penulis) System.out.print(p.getNama() + " ");
    //     System.out.println();
    //     System.out.println("Sinopsis : " + sinopsis);
    //     System.out.println("Jml Kata : " + hitungJumlahKata() + " kata");
    // }
    public double hitungRoyalti(double harga, double persen) {
    double totalPenjualan = harga * jumlahTerjual;
    double royalti        = totalPenjualan * (persen / 100);
    System.out.println("┌─────────────────────────────────────────┐");
    System.out.println("  Judul          : " + judul);
    System.out.printf ("  Harga / buku   : Rp %,.0f%n", harga);
    System.out.println("  Terjual        : " + jumlahTerjual + " buku");
    System.out.printf ("  Total Penjualan: Rp %,.0f%n", totalPenjualan);
    System.out.printf ("  Royalti (%.0f%%)  : Rp %,.0f%n", persen, royalti);
    System.out.println("└─────────────────────────────────────────┘");
    return royalti;
}
public void displayInfo(double harga, double persen) {
    System.out.println("Judul    : " + judul);
    System.out.println("Kategori : " + kategori);
    System.out.print  ("Penulis  : ");
    for (Penulis p : penulis) System.out.print(p.getNama() + " ");
    System.out.println();
    System.out.println("Sinopsis : " + sinopsis);
    System.out.println("Jml Kata : " + hitungJumlahKata() + " kata");
    System.out.println("Terjual  : " + jumlahTerjual + " buku");
    System.out.printf ("Harga    : Rp %,.0f%n", harga);           // harga sekarang double ✓
    System.out.printf ("Royalti  : Rp %,.0f (%.0f%% dari Rp %,.0f)%n",
                        hitungRoyalti(harga, persen), persen, harga * jumlahTerjual);
}
}
