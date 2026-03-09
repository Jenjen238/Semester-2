package perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Buku[] teknologi = {
            new Buku("Pemrograman Java", 
                new Penulis[]{ new Penulis("Andi") }, "Teknologi"),

            new Buku("Dasar Python", 
                new Penulis[]{ new Penulis("Budi") }, "Teknologi"),

            new Buku("Machine Learning", 
                new Penulis[]{ new Penulis("Citra") }, "Teknologi"),

            new Buku("Jaringan Komputer", 
                new Penulis[]{ new Penulis("Deni") }, "Teknologi"),

            new Buku("Basis Data", 
                new Penulis[]{ new Penulis("Eka") }, "Teknologi")
        };

        Buku[] filsafat = {
            new Buku("Filsafat Ilmu", 
                new Penulis[]{ new Penulis("Ahmad") }, "Filsafat"),

            new Buku("Logika Berpikir", 
                new Penulis[]{ new Penulis("Sinta") }, "Filsafat"),

            new Buku("Etika Modern", 
                new Penulis[]{ new Penulis("Rudi") }, "Filsafat"),

            new Buku("Filsafat Timur", 
                new Penulis[]{ new Penulis("Nina") }, "Filsafat"),

            new Buku("Pemikiran Plato", 
                new Penulis[]{ new Penulis("Bayu") }, "Filsafat")
        };


        Buku[] sejarah = {
            new Buku("Sejarah Indonesia", 
                new Penulis[]{ new Penulis("Hasan") }, "Sejarah"),

            new Buku("Perang Dunia II", 
                new Penulis[]{ new Penulis("Dewi") }, "Sejarah"),

            new Buku("Kerajaan Nusantara", 
                new Penulis[]{ new Penulis("Fajar") }, "Sejarah"),

            new Buku("Kolonialisme", 
                new Penulis[]{ new Penulis("Indra") }, "Sejarah"),

            new Buku("Revolusi Dunia", 
                new Penulis[]{ new Penulis("Rina") }, "Sejarah")
        };


        Buku[] agama = {
            new Buku("Tafsir Al-Quran", 
                new Penulis[]{ new Penulis("Ustadz Ali") }, "Agama"),

            new Buku("Hadis Pilihan", 
                new Penulis[]{ new Penulis("Ustadz Umar") }, "Agama"),

            new Buku("Sejarah Nabi", 
                new Penulis[]{ new Penulis("Zainal") }, "Agama"),

            new Buku("Akhlak Mulia", 
                new Penulis[]{ new Penulis("Rahma") }, "Agama"),

            new Buku("Fiqih Dasar", 
                new Penulis[]{ new Penulis("Abdullah") }, "Agama")
        };


        Buku[] psikologi = {
            new Buku("Psikologi Umum", 
                new Penulis[]{ new Penulis("Hadi") }, "Psikologi"),

            new Buku("Psikologi Anak", 
                new Penulis[]{ new Penulis("Mira") }, "Psikologi"),

            new Buku("Kepribadian", 
                new Penulis[]{ new Penulis("Tono") }, "Psikologi"),

            new Buku("Motivasi Hidup", 
                new Penulis[]{ new Penulis("Rizky") }, "Psikologi"),

            new Buku("Psikologi Sosial", 
                new Penulis[]{ new Penulis("Putri") }, "Psikologi")
        };


        Buku[] politik = {
            new Buku("Ilmu Politik", 
                new Penulis[]{ new Penulis("Bambang") }, "Politik"),

            new Buku("Demokrasi Modern", 
                new Penulis[]{ new Penulis("Rendra") }, "Politik"),

            new Buku("Sistem Pemerintahan", 
                new Penulis[]{ new Penulis("Agus") }, "Politik"),

            new Buku("Kebijakan Publik", 
                new Penulis[]{ new Penulis("Lina") }, "Politik"),

            new Buku("Hubungan Internasional", 
                new Penulis[]{ new Penulis("Dito") }, "Politik")
        };

        Buku[] fiksi = {
            new Buku("Petualangan Ajaib", 
                new Penulis[]{ new Penulis("Sari") }, "Fiksi"),

            new Buku("Dunia Fantasi", 
                new Penulis[]{ new Penulis("Raka") }, "Fiksi"),

            new Buku("Cinta di Senja", 
                new Penulis[]{ new Penulis("Maya") }, "Fiksi"),

            new Buku("Misteri Kota Tua", 
                new Penulis[]{ new Penulis("Dian") }, "Fiksi"),

            new Buku("Legenda Nusantara", 
                new Penulis[]{ new Penulis("Wawan") }, "Fiksi")
        };

        Kategori[] semuaKategori = {
            new Kategori("Teknologi", teknologi),
            new Kategori("Filsafat", filsafat),
            new Kategori("Sejarah", sejarah),
            new Kategori("Agama", agama),
            new Kategori("Psikologi", psikologi),
            new Kategori("Politik", politik),
            new Kategori("Fiksi", fiksi)
        };

        for (Kategori k : semuaKategori) {
            System.out.println("Kategori: " + k.getNama());

            for (Buku b : k.getListBuku()) {
                System.out.println("  Judul: " + b.getJudul());
                System.out.print("  Penulis: ");

                for (Penulis p : b.getPenulis()) {
                    System.out.print(p.getNama() + " ");
                }

                System.out.println("\n");
            }

            System.out.println("----------------------------------");
        }
    }
}
