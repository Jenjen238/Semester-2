package LatihanQuiz;

public class Motor extends Transportasi{
    public Motor (String nama, double tarifPerKm){
        super(nama, tarifPerKm);
    }
    @Override 
    public double hitungBiaya(double jarak) throws JarakException{
        if (jarak <= 0){
            throw new JarakException("Jarak harus lebih dari 0 km!");
        } 
        return getTarifPerKm() * jarak;
    }
}
