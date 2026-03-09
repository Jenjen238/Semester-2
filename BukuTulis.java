

public class BukuTulis {
    private int jumlahLembar;
    private int totalHalaman;
    private int kataPerHari;
    private double halamanPerHari;
    private double lamaHari;

    public void setJumlahLembar(int lembar){
        jumlahLembar = lembar;
        hitungTotalHalaman();
    }

    public void setKataPerHari(int kata){
        kataPerHari = kata;
    }

    public void setHalamanPerHari(double halaman){
        halamanPerHari = halaman;
    }

    private void hitungTotalHalaman(){
        totalHalaman = jumlahLembar * 2;
    }

    public double hitungLamaHari(){
        return lamaHari = totalHalaman / halamanPerHari;
    }

    public void displayMessage(){
        hitungLamaHari();
        System.out.println("Jumlah lembar buku : " + jumlahLembar);
        System.out.println("Total halaman : " + totalHalaman);
        System.out.println("Menulis : " + kataPerHari + " kata per hari sama dengan " + halamanPerHari + " halaman per hari");
        System.out.println("Setara : " + halamanPerHari + " halaman per hari");
        System.out.println("Waktu yang dibutuhkan : " + lamaHari + " hari");
    }
}
