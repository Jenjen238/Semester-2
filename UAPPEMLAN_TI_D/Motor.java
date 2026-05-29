package UAPPEMLAN_TI_D;

public class Motor extends Kendaraan {
    String jenisTransmisi;

    public Motor (String kodeKendaraan, String namaKendaraan, double hargaSewaperHari, String jenisTransmisi){
        super(kodeKendaraan, namaKendaraan, hargaSewaperHari);
        this.jenisTransmisi = jenisTransmisi;
    }
    
    public void setJenisTransmisi(String jenisTransmisi){
        this.jenisTransmisi = jenisTransmisi;
    }
    public String getJenisTransmisi(){
        return this.jenisTransmisi;
    }

    @Override
    public double hitungBiayaDasar(int lamaSewa){
        double biayaDasar = lamaSewa * getHargaSewaperHari();
        if (jenisTransmisi.equalsIgnoreCase("matik")){
            biayaDasar += 10000 * lamaSewa;
        }
        return biayaDasar;
    }

    @Override
    public void tampilkanInfoKendaraan(){
        super.tampilkanInfoKendaraan();
        System.out.println("Jenis Transmisi: " + this.jenisTransmisi);  
    }
}
