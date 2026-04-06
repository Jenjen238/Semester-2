package MODUL6_Inheritance;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pekerja extends Manusia{
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja (String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak){
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }
    public void setGaji(double gaji){
        this.gaji = gaji;
    }
    public double getGaji(){
        return this.gaji;
    }
    public void setTahunMasuk(LocalDate tahunMasuk){
        this.tahunMasuk = tahunMasuk;
    }
    public LocalDate getTahunMasuk(){
        return this.tahunMasuk;
    }
    public void setJumlahAnak(int jumlahAnak){
        this.jumlahAnak = jumlahAnak;
    }
    public int getJumlahAnak(){
        return this.jumlahAnak;
    }
    public double getBonus(){
        int lamaBekerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (lamaBekerja >= 0 && lamaBekerja <= 5){
            return gaji * 0.05;
        } else if (lamaBekerja >= 6 && lamaBekerja <= 10){
            return gaji * 0.10;
        } else {
            return gaji * 0.15;
        }
    }
    @Override
    public double getTunjangan(){
        return super.getTunjangan() + (getJumlahAnak() * 20);
    }
    @Override
    public double getPendapatan(){
        return gaji + getTunjangan() + getBonus();
    }
    @Override
    public String toString() {
        return super.toString() + String.format(
        "\nTahun Masuk   : %s" +
        "\nJumlah Anak   : %d" +
        "\nGaji          : $%.2f",
        tahunMasuk.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")), jumlahAnak, gaji
        );
    }
}
