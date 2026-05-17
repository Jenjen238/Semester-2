package MODUL11_CollectionSortingAndSearching;

public class Pemain {
    private int no;
    private int tinggi;
    private int berat;

    public Pemain(int no, int tinggi, int berat){
        this.no = no;
        this.tinggi = tinggi;
        this.berat = berat;
    }
    
    public int getNo(){
        return no;
    }

    public int getTinggi(){
        return tinggi;
    }

    public int getBerat(){
        return berat;
    }

    @Override
    public String toString(){
        return "No " + no +
                " | Tinggi: " + tinggi +
                " | Berat: " + berat;
    }
}