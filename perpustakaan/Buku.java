package perpustakaan;

public class Buku {
    private final String judul;
    private final Penulis[] penulis;
    private final String kategori;

    public Buku(String judul, Penulis[] penulis, String kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
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
}
