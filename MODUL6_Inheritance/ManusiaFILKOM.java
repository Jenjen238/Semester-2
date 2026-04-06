package MODUL6_Inheritance;

public class ManusiaFILKOM extends Manusia{
    private String nim;
    private double ipk;

    public ManusiaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk){
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public String getNim(){
        return this.nim;
    }
    public void setIPK(double ipk){
        this.ipk = ipk;
    }
    public double getIPK(){
        return this.ipk;
    }
    public String getStatus(){
        String angkatan = "20" + nim.substring(0,2);
        char kodeProdi = nim.charAt(6);
        String Prodi = "";

        switch (kodeProdi){
            case '2' : Prodi = "Teknik Informatika";
            break;
            case '3' : Prodi = "Teknik Komputer";
            break;
            case '4' : Prodi = "Sistem Informasi";
            break;
            case '6' : Prodi = "Pendidikan Teknologi Informasi";
            break;
            case '7' : Prodi = "Teknologi Informasi";
            break;
            default: Prodi = "Idk";
            break;
        }
        return Prodi + ", " + angkatan;
    }
    public double getBeasiswa(){
        if (ipk >= 3.6 ) {
            return 75;
        } else if (ipk >= 3.0 && ipk <= 3.5){
            return 50;
        } else {
            return 0;
        }
    }
    public String toString(){
        return super.toString() + String.format(
            "\nNIM       : %s\n" +
            "IPK       : %.2f\n" +
            "Status    : %s\n" +
            "Beasiswa  : $%.0f%%",
            nim, ipk, getStatus(), getBeasiswa()
        );
    }
}
