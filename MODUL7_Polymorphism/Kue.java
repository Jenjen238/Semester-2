package MODUL7_Polymorphism;

public abstract class Kue {
    private String nama;
    private double harga;

    public Kue(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setHarga(double harga){
        this.harga = harga;
    }
    public String getNama(){
        return this.nama;
    }
    public double getHarga(){
        return this.harga;
    }
    public abstract double hitungHarga();
    
    @Override
    public String toString(){
        return String.format(
            "Nama Kue        : %s\n" +
            "Harga           : %.2f" ,
            nama, harga
        );
    }
}
