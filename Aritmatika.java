public class Aritmatika {
    //method non-static
    public void hitungPenjumlahan(int a,int b){
        int nilai = a+b;
            System.out.println("nilai penjumlahan adalah : "+ nilai);
    }
    public double hitungPembagian(String nil1, String nil2){
        double angka1 = Double.parseDouble(nil1);
        double angka2 = Double.parseDouble(nil2);
        double hasil = angka1/angka2;
        System.out.println("nilai pembagian adalah : " + hasil);
        return hasil;
    }
    //method static
    public static void hitungPerkalian(int a, int b){
        int nilai = a*b;
            System.out.println("nilai perkalian adalah : "+ nilai);
    }
    public static void hitungPengurangan(int a, int b){
        int nilai = a-b;
            System.out.println("nilai pengurangan adalah : "+ nilai);
    }
}
