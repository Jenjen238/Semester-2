package LatihanQuiz;
public abstract class Transportasi {
    private String nama;
    private double tarifPerKm;

    // No 1
    public Transportasi(String nama, double tarifPerKm){
        this.nama = nama;
        this.tarifPerKm = tarifPerKm;
    }
    public String getNama() {
        return nama;
    }

    public double getTarifPerKm() {
        return tarifPerKm;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTarifPerKm(double tarifPerKm) {
        this.tarifPerKm = tarifPerKm;
    }
    // No 2
    public abstract double hitungBiaya(double jarak) throws JarakException;
    
    @Override
    public String toString() {
        return String.format("Transportasi: %s | Tarif/km: Rp%.0f", nama, tarifPerKm);
    }
}
