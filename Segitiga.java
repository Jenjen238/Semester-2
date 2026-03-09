public class Segitiga {
    //Materi Belajar Tipe data Refrence dan Primitif
    // Belajar Constructor
    
    double keliling;
    double luas;
    double alas;
    double tinggi; 
    String nama;

    public Segitiga (){}


    public Segitiga(double alas, double luas, double tinggi, double keliling) {
        this.alas = alas;
        this.luas = luas;
        this.tinggi = tinggi;
        this.keliling = keliling;
    }

    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    double hitungLuas() {
        double LuasSegitiga = 0.5 * alas * tinggi;
        return LuasSegitiga;
    }
}
