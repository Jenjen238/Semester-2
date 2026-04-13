package MODUL7_Polymorphism;

public class KueJadi extends Kue implements InfoKue {
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah){
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public void setJumlah(double jumlah){
        this.jumlah = jumlah;
    }

    public double getJumlah(){
        return this.jumlah;
    }

    @Override
    public double hitungHarga(){
        return getHarga() * jumlah * 2;
    }

    @Override
    public String getJenisKue(){
        return "Kue Jadi";
    }

    @Override
    public void tampilkanInfo(){
        System.out.println("[Jenis: " + getJenisKue() + "]");
        System.out.println(toString());
    }

    @Override
    public String toString(){
        return super.toString() + String.format(
            "\nJumlah           : %.0f\n" +
            "Total Harga      : %.2f",
            jumlah, hitungHarga()
        );
    }
}
