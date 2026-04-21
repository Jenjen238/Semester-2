package Quiz;

public class Karyawan {
    private String nama;
    private double gajiPokok;

    public Karyawan (String nama, double gajiPokok){
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setgajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    public double getgajiPokok(){
        return gajiPokok;
    }
}
