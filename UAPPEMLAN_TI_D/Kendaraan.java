package UAPPEMLAN_TI_D;

public abstract class Kendaraan {
    private String kodeKendaraan;
    private String namaKendaraan;
    private double hargaSewaperHari;
    private boolean isTersedia;

    public Kendaraan(String kodeKendaraan, String namaKendaraan, double hargaSewaperHari){
        this.kodeKendaraan = kodeKendaraan;
        this.namaKendaraan = namaKendaraan;
        this.hargaSewaperHari = hargaSewaperHari;
    }

    public void setKodeKendaraan(String kodeKendaraan){
        this.kodeKendaraan = kodeKendaraan;
    }
    public String getKodeKendaraan(){
        return this.kodeKendaraan;
    }

    public void setNamaKendaraan(String namaKendaraan){
        this.namaKendaraan = namaKendaraan;
    }
    public String getNamaKendaraan(){
        return this.namaKendaraan;
    }

    public void setHargaSewaperHari(double hargaSewaperHari){
        this.hargaSewaperHari = hargaSewaperHari;
    }
    public double getHargaSewaperHari(){
        return this.hargaSewaperHari;
    }

    public void setIsTersedia(boolean isTersedia){
        this.isTersedia = isTersedia;
    }
    public boolean getIsTersedia(){
        return this.isTersedia;
    }

    public void tampilkanInfoKendaraan(){
        System.out.println("Kode Kendaraan: " + this.kodeKendaraan);
        System.out.println("Nama Kendaraan: " + this.namaKendaraan);
        System.out.println("Harga Sewa per Hari: " + this.hargaSewaperHari);
        System.out.println("Status Ketersediaan: " + (this.isTersedia ? "Tersedia" : "Tidak Tersedia"));
    }

    public abstract double hitungBiayaDasar(int lamaSewa);
}
