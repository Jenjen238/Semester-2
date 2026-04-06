package MODUL6_Inheritance;

public class Manusia {
    private String nama;
    private boolean jenisKelamin; // true = laki-laki, false = perempuan
    private String nik;
    private boolean menikah; // true = menikah, false = jomblo

    public Manusia(){

    }
    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah){
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return this.nama;
    }
    public void setJenisKelamin(boolean jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    public boolean getJenisKelamin(){
        return this.jenisKelamin;
    }
    public void setNik(String nik){
        this.nik = nik;
    }
    public String getNik(){
        return this.nik;
    }
    public void setMenikah(boolean menikah){
        this.menikah = menikah;
    }
    public boolean getMenikah(){
        return this.menikah;
    }
    public double getTunjangan(){
        double tunjangan = 0;
        if (this.menikah == true && this.jenisKelamin == true){
            tunjangan = 25;
        } else if (this.menikah == true && this.jenisKelamin == false){
            tunjangan = 20;
        } else if (this.menikah == false){
            tunjangan = 15;
        }
        return tunjangan;
    }
    public double getPendapatan(){
        return getTunjangan();
    }
    
    @Override
    public String toString(){
        return String.format(
            "Nama          : %s\n" +
            "NIK           : %s\n" +
            "Jenis Kelamin : %s\n" +
            "Menikah       : %s\n" +
            "Pendapatan    : $%.2f",
            nama, nik,
            jenisKelamin ? "Laki-laki" : "Perempuan",
            menikah ? "Menikah" : "Tidak Menikah",
            getPendapatan()
        );
    }
}
