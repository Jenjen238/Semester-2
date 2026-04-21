package LatihanQuiz;

public class Mobil extends Transportasi implements Diskonable {
    public Mobil (String nama, double tarifPerKm){
        super(nama, tarifPerKm);
    }
    @Override
    public double hitungBiaya(double jarak) throws JarakException {
        if (jarak <= 0){
            throw new JarakException ("Jarak harus lebih dari 0 km!");
        }
        return getTarifPerKm() * jarak * 1.5;
    }
    @Override
    public double hitungDiskon(double totalBiaya){
        return totalBiaya * 0.1;
    }
}

    

