package UAPPEMLAN_TI_D;

public class Mobil extends Kendaraan{
    int jumlahKursi;

    public Mobil(String kodeKendaraan, String namaKendaraan, double hargaSewaperHari, int jumlahKursi){
        super(kodeKendaraan, namaKendaraan, hargaSewaperHari);
        this.jumlahKursi = jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi){
        this.jumlahKursi = jumlahKursi;
    }
    public int getJumlahKursi(){
        return this.jumlahKursi;
    }

    @Override
    public double hitungBiayaDasar(int lamaSewa){
        double biayaDasar = lamaSewa * getHargaSewaperHari();
        if (jumlahKursi > 5){
            biayaDasar += 50;
        }
        return biayaDasar;
    }

    @Override
    public void tampilkanInfoKendaraan(){
        super.tampilkanInfoKendaraan();
        System.out.println("Jumlah Kursi: " + this.jumlahKursi);
    }
}
