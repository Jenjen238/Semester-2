package Quiz;

public class Manager extends Karyawan {
    private double tunjangan;

    public Manager (String nama, double gajiPokok, double tunjangan){
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }
    public void cetakInfoGaji(){
        double totalGaji = getgajiPokok() + tunjangan;
        System.out.printf("Total Gaji Manager %s : %.1f", getNama() , totalGaji );
    }
}

class Main {
    public static void main(String[] args) {
        Manager Hanif = new Manager("Hanif", 5000000, 2000000);
        Hanif.cetakInfoGaji();
    }
}
