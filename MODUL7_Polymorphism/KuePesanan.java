package MODUL7_Polymorphism;

public class KuePesanan extends Kue implements InfoKue {
    private double berat;
    
    public KuePesanan(String nama, double harga, double berat){
        super(nama, harga);
        this.berat = berat;
    }

    public void setBerat(double berat){
        this.berat = berat;
    }

    public double getBerat(){
        return this.berat;
    }

    @Override
    public double hitungHarga(){
        return getHarga() * berat;
    }

    @Override
    public String getJenisKue(){
        return "Kue Pesanan";
    }

    @Override
    public String toString(){
        return super.toString() + String.format(
            "\nBerat            : %.2f\n" +
            "Total Harga      : %.2f",
            berat, hitungHarga()
        );
    }

    @Override
    public void tampilkanInfo(){
        System.out.println("[Jenis: " + getJenisKue() + "]");
        System.out.println(toString());
    }
}