package perpustakaan;

// public class MainPerpustakaan {
//     public static void main(String[] args) {
//         Buku[] teknologi = {
//             new Buku("Pemrograman Java", 
//                 new Penulis[]{ new Penulis("Andi") }, "Teknologi"),

//             new Buku("Dasar Python", 
//                 new Penulis[]{ new Penulis("Budi") }, "Teknologi"),

//             new Buku("Machine Learning", 
//                 new Penulis[]{ new Penulis("Citra") }, "Teknologi"),

//             new Buku("Jaringan Komputer", 
//                 new Penulis[]{ new Penulis("Deni") }, "Teknologi"),

//             new Buku("Basis Data", 
//                 new Penulis[]{ new Penulis("Eka") }, "Teknologi")
//         };

//         Buku[] filsafat = {
//             new Buku("Filsafat Ilmu", 
//                 new Penulis[]{ new Penulis("Ahmad") }, "Filsafat"),

//             new Buku("Logika Berpikir", 
//                 new Penulis[]{ new Penulis("Sinta") }, "Filsafat"),

//             new Buku("Etika Modern", 
//                 new Penulis[]{ new Penulis("Rudi") }, "Filsafat"),

//             new Buku("Filsafat Timur", 
//                 new Penulis[]{ new Penulis("Nina") }, "Filsafat"),

//             new Buku("Pemikiran Plato", 
//                 new Penulis[]{ new Penulis("Bayu") }, "Filsafat")
//         };


//         Buku[] sejarah = {
//             new Buku("Sejarah Indonesia", 
//                 new Penulis[]{ new Penulis("Hasan") }, "Sejarah"),

//             new Buku("Perang Dunia II", 
//                 new Penulis[]{ new Penulis("Dewi") }, "Sejarah"),

//             new Buku("Kerajaan Nusantara", 
//                 new Penulis[]{ new Penulis("Fajar") }, "Sejarah"),

//             new Buku("Kolonialisme", 
//                 new Penulis[]{ new Penulis("Indra") }, "Sejarah"),

//             new Buku("Revolusi Dunia", 
//                 new Penulis[]{ new Penulis("Rina") }, "Sejarah")
//         };


//         Buku[] agama = {
//             new Buku("Tafsir Al-Quran", 
//                 new Penulis[]{ new Penulis("Ustadz Ali") }, "Agama"),

//             new Buku("Hadis Pilihan", 
//                 new Penulis[]{ new Penulis("Ustadz Umar") }, "Agama"),

//             new Buku("Sejarah Nabi", 
//                 new Penulis[]{ new Penulis("Zainal") }, "Agama"),

//             new Buku("Akhlak Mulia", 
//                 new Penulis[]{ new Penulis("Rahma") }, "Agama"),

//             new Buku("Fiqih Dasar", 
//                 new Penulis[]{ new Penulis("Abdullah") }, "Agama")
//         };


//         Buku[] psikologi = {
//             new Buku("Psikologi Umum", 
//                 new Penulis[]{ new Penulis("Hadi") }, "Psikologi"),

//             new Buku("Psikologi Anak", 
//                 new Penulis[]{ new Penulis("Mira") }, "Psikologi"),

//             new Buku("Kepribadian", 
//                 new Penulis[]{ new Penulis("Tono") }, "Psikologi"),

//             new Buku("Motivasi Hidup", 
//                 new Penulis[]{ new Penulis("Rizky") }, "Psikologi"),

//             new Buku("Psikologi Sosial", 
//                 new Penulis[]{ new Penulis("Putri") }, "Psikologi")
//         };


//         Buku[] politik = {
//             new Buku("Ilmu Politik", 
//                 new Penulis[]{ new Penulis("Bambang") }, "Politik"),

//             new Buku("Demokrasi Modern", 
//                 new Penulis[]{ new Penulis("Rendra") }, "Politik"),

//             new Buku("Sistem Pemerintahan", 
//                 new Penulis[]{ new Penulis("Agus") }, "Politik"),

//             new Buku("Kebijakan Publik", 
//                 new Penulis[]{ new Penulis("Lina") }, "Politik"),

//             new Buku("Hubungan Internasional", 
//                 new Penulis[]{ new Penulis("Dito") }, "Politik")
//         };

//         Buku[] fiksi = {
//             new Buku("Petualangan Ajaib", 
//                 new Penulis[]{ new Penulis("Sari") }, "Fiksi"),

//             new Buku("Dunia Fantasi", 
//                 new Penulis[]{ new Penulis("Raka") }, "Fiksi"),

//             new Buku("Cinta di Senja", 
//                 new Penulis[]{ new Penulis("Maya") }, "Fiksi"),

//             new Buku("Misteri Kota Tua", 
//                 new Penulis[]{ new Penulis("Dian") }, "Fiksi"),

//             new Buku("Legenda Nusantara", 
//                 new Penulis[]{ new Penulis("Wawan") }, "Fiksi")
//         };

//         Kategori[] semuaKategori = {
//             new Kategori("Teknologi", teknologi),
//             new Kategori("Filsafat", filsafat),
//             new Kategori("Sejarah", sejarah),
//             new Kategori("Agama", agama),
//             new Kategori("Psikologi", psikologi),
//             new Kategori("Politik", politik),
//             new Kategori("Fiksi", fiksi)
//         };

//         for (Kategori k : semuaKategori) {
//             System.out.println("Kategori: " + k.getNama());

//             for (Buku b : k.getListBuku()) {
//                 System.out.println("  Judul: " + b.getJudul());
//                 System.out.print("  Penulis: ");

//                 for (Penulis p : b.getPenulis()) {
//                     System.out.print(p.getNama() + " ");
//                 }

//                 System.out.println("\n");
//             }

//             System.out.println("----------------------------------");
//         }
//     }
// }

// public class MainPerpustakaan {
//     public static void main(String[] args) {

//         Buku[] teknologi = {
//             new Buku("Pemrograman Java",
//                 new Penulis[]{ new Penulis("Andi") }, "Teknologi",
//                 "Buku ini membahas dasar hingga lanjutan pemrograman Java secara lengkap dan terstruktur."),
//             new Buku("Dasar Python",
//                 new Penulis[]{ new Penulis("Budi") }, "Teknologi",
//                 "Panduan belajar Python dari nol untuk pemula yang ingin menguasai pemrograman modern."),
//             new Buku("Machine Learning",
//                 new Penulis[]{ new Penulis("Citra") }, "Teknologi",
//                 "Pengantar machine learning dengan contoh kasus nyata menggunakan Python dan scikit-learn."),
//             new Buku("Jaringan Komputer",
//                 new Penulis[]{ new Penulis("Deni") }, "Teknologi",
//                 "Membahas konsep dasar jaringan komputer mulai dari topologi hingga protokol komunikasi data."),
//             new Buku("Basis Data",
//                 new Penulis[]{ new Penulis("Eka") }, "Teknologi",
//                 "Penjelasan mendalam tentang perancangan basis data relasional menggunakan SQL dan normalisasi.")
//         };

//         Buku[] fiksi = {
//             new Buku("Petualangan Ajaib",
//                 new Penulis[]{ new Penulis("Sari") }, "Fiksi",
//                 "Kisah seorang anak yang menemukan portal ajaib menuju dunia penuh keajaiban dan petualangan seru."),
//             new Buku("Dunia Fantasi",
//                 new Penulis[]{ new Penulis("Raka") }, "Fiksi",
//                 "Novel fantasi epik tentang pahlawan muda yang berjuang melawan kejahatan demi menyelamatkan dunia."),
//             new Buku("Cinta di Senja",
//                 new Penulis[]{ new Penulis("Maya") }, "Fiksi",
//                 "Cerita cinta yang mengharukan antara dua insan berbeda latar belakang di kota kecil yang damai."),
//             new Buku("Misteri Kota Tua",
//                 new Penulis[]{ new Penulis("Dian") }, "Fiksi",
//                 "Detektif muda memecahkan misteri pembunuhan di kota tua yang menyimpan banyak rahasia kelam."),
//             new Buku("Legenda Nusantara",
//                 new Penulis[]{ new Penulis("Wawan") }, "Fiksi",
//                 "Kumpulan legenda nusantara yang diceritakan ulang dengan gaya modern dan penuh nilai budaya lokal.")
//         };

//         // ── Kategori Filsafat ─────────────────────────────────
//         Buku[] filsafat = {
//             new Buku("Filsafat Ilmu",
//                 new Penulis[]{ new Penulis("Ahmad") }, "Filsafat",
//                 "Membahas hakikat ilmu pengetahuan secara mendalam dari sudut pandang filsafat barat dan timur."),
//             new Buku("Logika Berpikir",
//                 new Penulis[]{ new Penulis("Sinta") }, "Filsafat",
//                 "Panduan lengkap tentang cara berpikir logis dan kritis dalam menghadapi berbagai persoalan kehidupan."),
//             new Buku("Etika Modern",
//                 new Penulis[]{ new Penulis("Rudi") }, "Filsafat",
//                 "Kajian etika kontemporer yang membahas nilai moral manusia di tengah perubahan zaman yang cepat."),
//             new Buku("Filsafat Timur",
//                 new Penulis[]{ new Penulis("Nina") }, "Filsafat",
//                 "Pengantar pemikiran filsafat dari Asia meliputi Konfusianisme, Taoisme, dan filsafat Hindu Budha."),
//             new Buku("Pemikiran Plato",
//                 new Penulis[]{ new Penulis("Bayu") }, "Filsafat",
//                 "Uraian mendalam tentang gagasan besar Plato mulai dari teori ide hingga konsep negara ideal.")
//         };

//         // ── Kategori Agama ────────────────────────────────────
//         Buku[] agama = {
//             new Buku("Tafsir Al-Quran",
//                 new Penulis[]{ new Penulis("Ustadz Ali") }, "Agama",
//                 "Penjelasan makna ayat-ayat Al-Quran secara komprehensif dengan pendekatan tafsir klasik dan modern."),
//             new Buku("Hadis Pilihan",
//                 new Penulis[]{ new Penulis("Ustadz Umar") }, "Agama",
//                 "Kumpulan hadis shahih pilihan disertai penjelasan makna dan relevansinya dalam kehidupan sehari-hari."),
//             new Buku("Sejarah Nabi",
//                 new Penulis[]{ new Penulis("Zainal") }, "Agama",
//                 "Perjalanan hidup Nabi Muhammad SAW dari kelahiran hingga wafat penuh keteladanan dan hikmah mendalam."),
//             new Buku("Akhlak Mulia",
//                 new Penulis[]{ new Penulis("Rahma") }, "Agama",
//                 "Panduan membangun akhlak terpuji berdasarkan Al-Quran dan hadis untuk kehidupan bermasyarakat harmonis."),
//             new Buku("Fiqih Dasar",
//                 new Penulis[]{ new Penulis("Abdullah") }, "Agama",
//                 "Pembahasan hukum Islam dasar meliputi thaharah, shalat, puasa, zakat, dan haji secara sistematis.")
//         };

//         // ── Kategori Sejarah ──────────────────────────────────
//         Buku[] sejarah = {
//             new Buku("Sejarah Indonesia",
//                 new Penulis[]{ new Penulis("Hasan") }, "Sejarah",
//                 "Mengulas perjalanan panjang bangsa Indonesia dari masa prasejarah hingga era kemerdekaan modern."),
//             new Buku("Perang Dunia II",
//                 new Penulis[]{ new Penulis("Dewi") }, "Sejarah",
//                 "Kisah lengkap Perang Dunia II yang mengubah tatanan dunia dan meninggalkan pelajaran berharga bagi umat manusia."),
//             new Buku("Kerajaan Nusantara",
//                 new Penulis[]{ new Penulis("Fajar") }, "Sejarah",
//                 "Menelusuri kejayaan kerajaan-kerajaan besar Nusantara seperti Majapahit, Sriwijaya, dan Mataram Islam."),
//             new Buku("Kolonialisme",
//                 new Penulis[]{ new Penulis("Indra") }, "Sejarah",
//                 "Analisis mendalam dampak kolonialisme Belanda terhadap sosial budaya dan ekonomi masyarakat Indonesia."),
//             new Buku("Revolusi Dunia",
//                 new Penulis[]{ new Penulis("Rina") }, "Sejarah",
//                 "Mengkaji revolusi-revolusi besar dunia yang mengubah sistem pemerintahan dan tatanan sosial secara fundamental.")
//         };

//         // ── Kategori Psikologi ────────────────────────────────
//         Buku[] psikologi = {
//             new Buku("Psikologi Umum",
//                 new Penulis[]{ new Penulis("Hadi") }, "Psikologi",
//                 "Pengantar ilmu psikologi yang membahas perilaku manusia, proses mental, dan faktor yang mempengaruhinya."),
//             new Buku("Psikologi Anak",
//                 new Penulis[]{ new Penulis("Mira") }, "Psikologi",
//                 "Panduan memahami tumbuh kembang anak dari sisi psikologis untuk mendukung pola asuh yang tepat."),
//             new Buku("Kepribadian",
//                 new Penulis[]{ new Penulis("Tono") }, "Psikologi",
//                 "Kajian teori kepribadian dari Freud hingga teori modern untuk memahami karakter dan perilaku manusia."),
//             new Buku("Motivasi Hidup",
//                 new Penulis[]{ new Penulis("Rizky") }, "Psikologi",
//                 "Strategi membangun motivasi diri yang kuat dan konsisten untuk meraih tujuan hidup secara optimal."),
//             new Buku("Psikologi Sosial",
//                 new Penulis[]{ new Penulis("Putri") }, "Psikologi",
//                 "Membahas bagaimana individu dipengaruhi oleh lingkungan sosial dalam berpikir, merasakan, dan berperilaku.")
//         };

//         // ── Kategori Politik ──────────────────────────────────
//         Buku[] politik = {
//             new Buku("Ilmu Politik",
//                 new Penulis[]{ new Penulis("Bambang") }, "Politik",
//                 "Pengantar ilmu politik yang membahas konsep kekuasaan, negara, pemerintahan, dan sistem politik dunia."),
//             new Buku("Demokrasi Modern",
//                 new Penulis[]{ new Penulis("Rendra") }, "Politik",
//                 "Mengkaji perkembangan demokrasi modern dan tantangannya di era globalisasi serta digitalisasi informasi."),
//             new Buku("Sistem Pemerintahan",
//                 new Penulis[]{ new Penulis("Agus") }, "Politik",
//                 "Perbandingan berbagai sistem pemerintahan dunia mulai dari presidensial, parlementer, hingga monarki konstitusional."),
//             new Buku("Kebijakan Publik",
//                 new Penulis[]{ new Penulis("Lina") }, "Politik",
//                 "Analisis proses perumusan dan implementasi kebijakan publik dalam konteks pemerintahan Indonesia modern."),
//             new Buku("Hubungan Internasional",
//                 new Penulis[]{ new Penulis("Dito") }, "Politik",
//                 "Membahas dinamika hubungan antarnegara, diplomasi, organisasi internasional, dan isu geopolitik global.")
//         };

//         // ── Gabung semua kategori ─────────────────────────────
//         Kategori[] semuaKategori = {
//             new Kategori("Teknologi", teknologi),
//             new Kategori("Fiksi",     fiksi),
//             new Kategori("Filsafat",  filsafat),
//             new Kategori("Agama",     agama),
//             new Kategori("Sejarah",   sejarah),
//             new Kategori("Psikologi", psikologi),
//             new Kategori("Politik",   politik)
//         };

//         // ── Tampilkan semua buku per kategori ─────────────────
//         for (Kategori k : semuaKategori) {
//             System.out.println("========== Kategori: " + k.getNama() + " ==========");
//             for (Buku b : k.getListBuku()) {
//                 b.displayInfo();
//                 System.out.println("----------------------------------");
//             }
//         }

//         // ── Uji cekKesamaan antar kategori ────────────────────
//         System.out.println("\n===== Uji Cek Kesamaan Antar Kategori =====");
//         teknologi[0].cekKesamaan(filsafat[0]);
//         agama[0].cekKesamaan(agama[1]);
//         sejarah[0].cekKesamaan(politik[0]);

//         // ── Uji copy ──────────────────────────────────────────
//         System.out.println("\n===== Uji Copy =====");
//         Buku bukuAsli = psikologi[0];
//         Buku bukuCopy = bukuAsli.copy();
//         System.out.println("Buku Asli :"); bukuAsli.displayInfo();
//         System.out.println("\nBuku Copy :"); bukuCopy.displayInfo();
//         System.out.println("\nApakah objek sama? " + (bukuAsli == bukuCopy));
//         System.out.println("Apakah nilai sama?  " + bukuAsli.getJudul().equals(bukuCopy.getJudul()));
//     }
// }
// public class MainPerpustakaan {
//     public static void main(String[] args) {

//         // ── Data buku dengan sinopsis + jumlahTerjual ─────────
//         Buku[] teknologi = {
//             new Buku("Pemrograman Java",
//                 new Penulis[]{ new Penulis("Andi") }, "Teknologi",
//                 "Buku ini membahas dasar hingga lanjutan pemrograman Java secara lengkap dan terstruktur.", 150),
//             new Buku("Dasar Python",
//                 new Penulis[]{ new Penulis("Budi") }, "Teknologi",
//                 "Panduan belajar Python dari nol untuk pemula yang ingin menguasai pemrograman modern.", 200),
//             new Buku("Machine Learning",
//                 new Penulis[]{ new Penulis("Citra") }, "Teknologi",
//                 "Pengantar machine learning dengan contoh kasus nyata menggunakan Python dan scikit-learn.", 120),
//             new Buku("Jaringan Komputer",
//                 new Penulis[]{ new Penulis("Deni") }, "Teknologi",
//                 "Membahas konsep dasar jaringan komputer mulai dari topologi hingga protokol komunikasi data.", 90),
//             new Buku("Basis Data",
//                 new Penulis[]{ new Penulis("Eka") }, "Teknologi",
//                 "Penjelasan mendalam tentang perancangan basis data relasional menggunakan SQL dan normalisasi.", 110)
//         };

//         Buku[] fiksi = {
//             new Buku("Petualangan Ajaib",
//                 new Penulis[]{ new Penulis("Sari") }, "Fiksi",
//                 "Kisah seorang anak yang menemukan portal ajaib menuju dunia penuh keajaiban dan petualangan seru.", 80),
//             new Buku("Dunia Fantasi",
//                 new Penulis[]{ new Penulis("Raka") }, "Fiksi",
//                 "Novel fantasi epik tentang pahlawan muda yang berjuang melawan kejahatan demi menyelamatkan dunia.", 95),
//             new Buku("Cinta di Senja",
//                 new Penulis[]{ new Penulis("Maya") }, "Fiksi",
//                 "Cerita cinta yang mengharukan antara dua insan berbeda latar belakang di kota kecil yang damai.", 130),
//             new Buku("Misteri Kota Tua",
//                 new Penulis[]{ new Penulis("Dian") }, "Fiksi",
//                 "Detektif muda memecahkan misteri pembunuhan di kota tua yang menyimpan banyak rahasia kelam.", 75),
//             new Buku("Legenda Nusantara",
//                 new Penulis[]{ new Penulis("Wawan") }, "Fiksi",
//                 "Kumpulan legenda nusantara yang diceritakan ulang dengan gaya modern dan penuh nilai budaya lokal.", 60)
//         };

//         Buku[] filsafat = {
//             new Buku("Filsafat Ilmu",
//                 new Penulis[]{ new Penulis("Ahmad") }, "Filsafat",
//                 "Membahas hakikat ilmu pengetahuan secara mendalam dari sudut pandang filsafat barat dan timur.", 55),
//             new Buku("Logika Berpikir",
//                 new Penulis[]{ new Penulis("Sinta") }, "Filsafat",
//                 "Panduan lengkap tentang cara berpikir logis dan kritis dalam menghadapi berbagai persoalan kehidupan.", 70),
//             new Buku("Etika Modern",
//                 new Penulis[]{ new Penulis("Rudi") }, "Filsafat",
//                 "Kajian etika kontemporer yang membahas nilai moral manusia di tengah perubahan zaman yang cepat.", 45),
//             new Buku("Filsafat Timur",
//                 new Penulis[]{ new Penulis("Nina") }, "Filsafat",
//                 "Pengantar pemikiran filsafat dari Asia meliputi Konfusianisme, Taoisme, dan filsafat Hindu Budha.", 40),
//             new Buku("Pemikiran Plato",
//                 new Penulis[]{ new Penulis("Bayu") }, "Filsafat",
//                 "Uraian mendalam tentang gagasan besar Plato mulai dari teori ide hingga konsep negara ideal.", 65)
//         };

//         Buku[] agama = {
//             new Buku("Tafsir Al-Quran",
//                 new Penulis[]{ new Penulis("Ustadz Ali") }, "Agama",
//                 "Penjelasan makna ayat-ayat Al-Quran secara komprehensif dengan pendekatan tafsir klasik dan modern.", 180),
//             new Buku("Hadis Pilihan",
//                 new Penulis[]{ new Penulis("Ustadz Umar") }, "Agama",
//                 "Kumpulan hadis shahih pilihan disertai penjelasan makna dan relevansinya dalam kehidupan sehari-hari.", 160),
//             new Buku("Sejarah Nabi",
//                 new Penulis[]{ new Penulis("Zainal") }, "Agama",
//                 "Perjalanan hidup Nabi Muhammad SAW dari kelahiran hingga wafat penuh keteladanan dan hikmah mendalam.", 140),
//             new Buku("Akhlak Mulia",
//                 new Penulis[]{ new Penulis("Rahma") }, "Agama",
//                 "Panduan membangun akhlak terpuji berdasarkan Al-Quran dan hadis untuk kehidupan bermasyarakat harmonis.", 120),
//             new Buku("Fiqih Dasar",
//                 new Penulis[]{ new Penulis("Abdullah") }, "Agama",
//                 "Pembahasan hukum Islam dasar meliputi thaharah, shalat, puasa, zakat, dan haji secara sistematis.", 100)
//         };

//         Buku[] sejarah = {
//             new Buku("Sejarah Indonesia",
//                 new Penulis[]{ new Penulis("Hasan") }, "Sejarah",
//                 "Mengulas perjalanan panjang bangsa Indonesia dari masa prasejarah hingga era kemerdekaan modern.", 85),
//             new Buku("Perang Dunia II",
//                 new Penulis[]{ new Penulis("Dewi") }, "Sejarah",
//                 "Kisah lengkap Perang Dunia II yang mengubah tatanan dunia dan meninggalkan pelajaran berharga bagi umat manusia.", 95),
//             new Buku("Kerajaan Nusantara",
//                 new Penulis[]{ new Penulis("Fajar") }, "Sejarah",
//                 "Menelusuri kejayaan kerajaan-kerajaan besar Nusantara seperti Majapahit, Sriwijaya, dan Mataram Islam.", 70),
//             new Buku("Kolonialisme",
//                 new Penulis[]{ new Penulis("Indra") }, "Sejarah",
//                 "Analisis mendalam dampak kolonialisme Belanda terhadap sosial budaya dan ekonomi masyarakat Indonesia.", 60),
//             new Buku("Revolusi Dunia",
//                 new Penulis[]{ new Penulis("Rina") }, "Sejarah",
//                 "Mengkaji revolusi-revolusi besar dunia yang mengubah sistem pemerintahan dan tatanan sosial secara fundamental.", 55)
//         };

//         Buku[] psikologi = {
//             new Buku("Psikologi Umum",
//                 new Penulis[]{ new Penulis("Hadi") }, "Psikologi",
//                 "Pengantar ilmu psikologi yang membahas perilaku manusia, proses mental, dan faktor yang mempengaruhinya.", 110),
//             new Buku("Psikologi Anak",
//                 new Penulis[]{ new Penulis("Mira") }, "Psikologi",
//                 "Panduan memahami tumbuh kembang anak dari sisi psikologis untuk mendukung pola asuh yang tepat.", 90),
//             new Buku("Kepribadian",
//                 new Penulis[]{ new Penulis("Tono") }, "Psikologi",
//                 "Kajian teori kepribadian dari Freud hingga teori modern untuk memahami karakter dan perilaku manusia.", 75),
//             new Buku("Motivasi Hidup",
//                 new Penulis[]{ new Penulis("Rizky") }, "Psikologi",
//                 "Strategi membangun motivasi diri yang kuat dan konsisten untuk meraih tujuan hidup secara optimal.", 130),
//             new Buku("Psikologi Sosial",
//                 new Penulis[]{ new Penulis("Putri") }, "Psikologi",
//                 "Membahas bagaimana individu dipengaruhi oleh lingkungan sosial dalam berpikir, merasakan, dan berperilaku.", 85)
//         };

//         Buku[] politik = {
//             new Buku("Ilmu Politik",
//                 new Penulis[]{ new Penulis("Bambang") }, "Politik",
//                 "Pengantar ilmu politik yang membahas konsep kekuasaan, negara, pemerintahan, dan sistem politik dunia.", 65),
//             new Buku("Demokrasi Modern",
//                 new Penulis[]{ new Penulis("Rendra") }, "Politik",
//                 "Mengkaji perkembangan demokrasi modern dan tantangannya di era globalisasi serta digitalisasi informasi.", 80),
//             new Buku("Sistem Pemerintahan",
//                 new Penulis[]{ new Penulis("Agus") }, "Politik",
//                 "Perbandingan berbagai sistem pemerintahan dunia mulai dari presidensial, parlementer, hingga monarki konstitusional.", 55),
//             new Buku("Kebijakan Publik",
//                 new Penulis[]{ new Penulis("Lina") }, "Politik",
//                 "Analisis proses perumusan dan implementasi kebijakan publik dalam konteks pemerintahan Indonesia modern.", 70),
//             new Buku("Hubungan Internasional",
//                 new Penulis[]{ new Penulis("Dito") }, "Politik",
//                 "Membahas dinamika hubungan antarnegara, diplomasi, organisasi internasional, dan isu geopolitik global.", 60)
//         };

//         Kategori[] semuaKategori = {
//             new Kategori("Teknologi", teknologi),
//             new Kategori("Fiksi",     fiksi),
//             new Kategori("Filsafat",  filsafat),
//             new Kategori("Agama",     agama),
//             new Kategori("Sejarah",   sejarah),
//             new Kategori("Psikologi", psikologi),
//             new Kategori("Politik",   politik)
//         };

//         // ── 1. Tampilkan semua buku dengan displayInfo(harga) ─
//         for (Kategori k : semuaKategori) {
//             System.out.println("========== Kategori: " + k.getNama() + " ==========");
//             for (Buku b : k.getListBuku()) {
//                 b.displayInfo(85000); // harga per buku Rp 85.000
//                 System.out.println("----------------------------------");
//             }
//         }

//         // ── 2. Uji cekKesamaan antar kategori ────────────────
//         System.out.println("\n===== Uji Cek Kesamaan Antar Kategori =====");
//         teknologi[0].cekKesamaan(filsafat[0]);
//         agama[0].cekKesamaan(agama[1]);
//         sejarah[0].cekKesamaan(politik[0]);

//         // ── 3. Uji hitungRoyalti ──────────────────────────────
//         System.out.println("\n===== Uji Hitung Royalti =====");
//         teknologi[0].hitungRoyalti(85000);
//         agama[0].hitungRoyalti(90000);
//         fiksi[2].hitungRoyalti(75000);

//         // ── 4. Uji copy ───────────────────────────────────────
//         System.out.println("\n===== Uji Copy =====");
//         Buku bukuAsli = psikologi[0];
//         Buku bukuCopy = bukuAsli.copy();
//         System.out.println("Buku Asli :"); bukuAsli.displayInfo(85000);
//         System.out.println("\nBuku Copy :"); bukuCopy.displayInfo(85000);
//         System.out.println("\nApakah objek sama? " + (bukuAsli == bukuCopy));
//         System.out.println("Apakah nilai sama?  " + bukuAsli.getJudul().equals(bukuCopy.getJudul()));
//     }
//}


public class MainPerpustakaan {
    public static void main(String[] args) {

        Buku[] teknologi = {
            new Buku("Pemrograman Java",
                new Penulis[]{ new Penulis("Andi") }, "Teknologi",
                "Buku ini membahas dasar hingga lanjutan pemrograman Java secara lengkap dan terstruktur.", 150),
            new Buku("Dasar Python",
                new Penulis[]{ new Penulis("Budi") }, "Teknologi",
                "Panduan belajar Python dari nol untuk pemula yang ingin menguasai pemrograman modern.", 200),
            new Buku("Machine Learning",
                new Penulis[]{ new Penulis("Citra") }, "Teknologi",
                "Pengantar machine learning dengan contoh kasus nyata menggunakan Python dan scikit-learn.", 120),
            new Buku("Jaringan Komputer",
                new Penulis[]{ new Penulis("Deni") }, "Teknologi",
                "Membahas konsep dasar jaringan komputer mulai dari topologi hingga protokol komunikasi data.", 90),
            new Buku("Basis Data",
                new Penulis[]{ new Penulis("Eka") }, "Teknologi",
                "Penjelasan mendalam tentang perancangan basis data relasional menggunakan SQL dan normalisasi.", 110)
        };

        Buku[] fiksi = {
            new Buku("Petualangan Ajaib",
                new Penulis[]{ new Penulis("Sari") }, "Fiksi",
                "Kisah seorang anak yang menemukan portal ajaib menuju dunia penuh keajaiban dan petualangan seru.", 80),
            new Buku("Dunia Fantasi",
                new Penulis[]{ new Penulis("Raka") }, "Fiksi",
                "Novel fantasi epik tentang pahlawan muda yang berjuang melawan kejahatan demi menyelamatkan dunia.", 95),
            new Buku("Cinta di Senja",
                new Penulis[]{ new Penulis("Maya") }, "Fiksi",
                "Cerita cinta yang mengharukan antara dua insan berbeda latar belakang di kota kecil yang damai.", 130),
            new Buku("Misteri Kota Tua",
                new Penulis[]{ new Penulis("Dian") }, "Fiksi",
                "Detektif muda memecahkan misteri pembunuhan di kota tua yang menyimpan banyak rahasia kelam.", 75),
            new Buku("Legenda Nusantara",
                new Penulis[]{ new Penulis("Wawan") }, "Fiksi",
                "Kumpulan legenda nusantara yang diceritakan ulang dengan gaya modern dan penuh nilai budaya lokal.", 60)
        };

        Buku[] filsafat = {
            new Buku("Filsafat Ilmu",
                new Penulis[]{ new Penulis("Ahmad") }, "Filsafat",
                "Membahas hakikat ilmu pengetahuan secara mendalam dari sudut pandang filsafat barat dan timur.", 55),
            new Buku("Logika Berpikir",
                new Penulis[]{ new Penulis("Sinta") }, "Filsafat",
                "Panduan lengkap tentang cara berpikir logis dan kritis dalam menghadapi berbagai persoalan kehidupan.", 70),
            new Buku("Etika Modern",
                new Penulis[]{ new Penulis("Rudi") }, "Filsafat",
                "Kajian etika kontemporer yang membahas nilai moral manusia di tengah perubahan zaman yang cepat.", 45),
            new Buku("Filsafat Timur",
                new Penulis[]{ new Penulis("Nina") }, "Filsafat",
                "Pengantar pemikiran filsafat dari Asia meliputi Konfusianisme, Taoisme, dan filsafat Hindu Budha.", 40),
            new Buku("Pemikiran Plato",
                new Penulis[]{ new Penulis("Bayu") }, "Filsafat",
                "Uraian mendalam tentang gagasan besar Plato mulai dari teori ide hingga konsep negara ideal.", 65)
        };

        Buku[] agama = {
            new Buku("Tafsir Al-Quran",
                new Penulis[]{ new Penulis("Ustadz Ali") }, "Agama",
                "Penjelasan makna ayat-ayat Al-Quran secara komprehensif dengan pendekatan tafsir klasik dan modern.", 180),
            new Buku("Hadis Pilihan",
                new Penulis[]{ new Penulis("Ustadz Umar") }, "Agama",
                "Kumpulan hadis shahih pilihan disertai penjelasan makna dan relevansinya dalam kehidupan sehari-hari.", 160),
            new Buku("Sejarah Nabi",
                new Penulis[]{ new Penulis("Zainal") }, "Agama",
                "Perjalanan hidup Nabi Muhammad SAW dari kelahiran hingga wafat penuh keteladanan dan hikmah mendalam.", 140),
            new Buku("Akhlak Mulia",
                new Penulis[]{ new Penulis("Rahma") }, "Agama",
                "Panduan membangun akhlak terpuji berdasarkan Al-Quran dan hadis untuk kehidupan bermasyarakat harmonis.", 120),
            new Buku("Fiqih Dasar",
                new Penulis[]{ new Penulis("Abdullah") }, "Agama",
                "Pembahasan hukum Islam dasar meliputi thaharah, shalat, puasa, zakat, dan haji secara sistematis.", 100)
        };

        Buku[] sejarah = {
            new Buku("Sejarah Indonesia",
                new Penulis[]{ new Penulis("Hasan") }, "Sejarah",
                "Mengulas perjalanan panjang bangsa Indonesia dari masa prasejarah hingga era kemerdekaan modern.", 85),
            new Buku("Perang Dunia II",
                new Penulis[]{ new Penulis("Dewi") }, "Sejarah",
                "Kisah lengkap Perang Dunia II yang mengubah tatanan dunia dan meninggalkan pelajaran berharga bagi umat manusia.", 95),
            new Buku("Kerajaan Nusantara",
                new Penulis[]{ new Penulis("Fajar") }, "Sejarah",
                "Menelusuri kejayaan kerajaan-kerajaan besar Nusantara seperti Majapahit, Sriwijaya, dan Mataram Islam.", 70),
            new Buku("Kolonialisme",
                new Penulis[]{ new Penulis("Indra") }, "Sejarah",
                "Analisis mendalam dampak kolonialisme Belanda terhadap sosial budaya dan ekonomi masyarakat Indonesia.", 60),
            new Buku("Revolusi Dunia",
                new Penulis[]{ new Penulis("Rina") }, "Sejarah",
                "Mengkaji revolusi-revolusi besar dunia yang mengubah sistem pemerintahan dan tatanan sosial secara fundamental.", 55)
        };

        Buku[] psikologi = {
            new Buku("Psikologi Umum",
                new Penulis[]{ new Penulis("Hadi") }, "Psikologi",
                "Pengantar ilmu psikologi yang membahas perilaku manusia, proses mental, dan faktor yang mempengaruhinya.", 110),
            new Buku("Psikologi Anak",
                new Penulis[]{ new Penulis("Mira") }, "Psikologi",
                "Panduan memahami tumbuh kembang anak dari sisi psikologis untuk mendukung pola asuh yang tepat.", 90),
            new Buku("Kepribadian",
                new Penulis[]{ new Penulis("Tono") }, "Psikologi",
                "Kajian teori kepribadian dari Freud hingga teori modern untuk memahami karakter dan perilaku manusia.", 75),
            new Buku("Motivasi Hidup",
                new Penulis[]{ new Penulis("Rizky") }, "Psikologi",
                "Strategi membangun motivasi diri yang kuat dan konsisten untuk meraih tujuan hidup secara optimal.", 130),
            new Buku("Psikologi Sosial",
                new Penulis[]{ new Penulis("Putri") }, "Psikologi",
                "Membahas bagaimana individu dipengaruhi oleh lingkungan sosial dalam berpikir, merasakan, dan berperilaku.", 85)
        };

        Buku[] politik = {
            new Buku("Ilmu Politik",
                new Penulis[]{ new Penulis("Bambang") }, "Politik",
                "Pengantar ilmu politik yang membahas konsep kekuasaan, negara, pemerintahan, dan sistem politik dunia.", 65),
            new Buku("Demokrasi Modern",
                new Penulis[]{ new Penulis("Rendra") }, "Politik",
                "Mengkaji perkembangan demokrasi modern dan tantangannya di era globalisasi serta digitalisasi informasi.", 80),
            new Buku("Sistem Pemerintahan",
                new Penulis[]{ new Penulis("Agus") }, "Politik",
                "Perbandingan berbagai sistem pemerintahan dunia mulai dari presidensial, parlementer, hingga monarki konstitusional.", 55),
            new Buku("Kebijakan Publik",
                new Penulis[]{ new Penulis("Lina") }, "Politik",
                "Analisis proses perumusan dan implementasi kebijakan publik dalam konteks pemerintahan Indonesia modern.", 70),
            new Buku("Hubungan Internasional",
                new Penulis[]{ new Penulis("Dito") }, "Politik",
                "Membahas dinamika hubungan antarnegara, diplomasi, organisasi internasional, dan isu geopolitik global.", 60)
        };

        Kategori[] semuaKategori = {
            new Kategori("Teknologi", teknologi),
            new Kategori("Fiksi",     fiksi),
            new Kategori("Filsafat",  filsafat),
            new Kategori("Agama",     agama),
            new Kategori("Sejarah",   sejarah),
            new Kategori("Psikologi", psikologi),
            new Kategori("Politik",   politik)
        };

        // ── 1. Tampilkan semua buku dengan displayInfo(harga, persen) ──
        for (Kategori k : semuaKategori) {
            System.out.println("========== Kategori: " + k.getNama() + " ==========");
            for (Buku b : k.getListBuku()) {
                b.displayInfo(85000, 10); // harga Rp 85.000, royalti 10%
                System.out.println("----------------------------------");
            }
        }

        // ── 2. Uji cekKesamaan antar kategori ──────────────────
        System.out.println("\n===== Uji Cek Kesamaan Antar Kategori =====");
        teknologi[0].cekKesamaan(filsafat[0]);
        agama[0].cekKesamaan(agama[1]);
        sejarah[0].cekKesamaan(politik[0]);

        // ── 3. Uji hitungRoyalti 2 parameter ───────────────────
        System.out.println("\n===== Uji Hitung Royalti =====");
        teknologi[0].hitungRoyalti(85000, 10); // Rp 85.000 - royalti 10%
        agama[0].hitungRoyalti(90000, 15);     // Rp 90.000 - royalti 15%
        fiksi[2].hitungRoyalti(75000, 20);     // Rp 75.000 - royalti 20%
        politik[1].hitungRoyalti(80000, 5);    // Rp 80.000 - royalti 5%

        // ── 4. Uji copy ─────────────────────────────────────────
        System.out.println("\n===== Uji Copy =====");
        Buku bukuAsli = psikologi[0];
        Buku bukuCopy = bukuAsli.copy();
        System.out.println("Buku Asli :"); bukuAsli.displayInfo(85000, 10);
        System.out.println("\nBuku Copy :"); bukuCopy.displayInfo(85000, 10);
        System.out.println("\nApakah objek sama? " + (bukuAsli == bukuCopy));
        System.out.println("Apakah nilai sama?  " + bukuAsli.getJudul().equals(bukuCopy.getJudul()));
    }
}