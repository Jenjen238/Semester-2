public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;

    private int kecepatankmh;
    private double waktuJam;
    private double waktuDetik;
    private double kecepatanMs;
    private double jarakKm;

    
    public void setNoPlat(String nomor){
        noPlat = nomor;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    public void setManufaktur(String merek){
        manufaktur = merek;
    }
    
    public void setKecepatan(int kecepatan){
        kecepatankmh = kecepatan;    
        rubahKecepatan(kecepatan);
    }

    private void rubahKecepatan(double kmPerJam){
        kecepatanMs = kmPerJam / 3.6;
    }

    public void setWaktu(double waktu){
        waktuJam = waktu;
        rubahSekon(waktu);
    }

    private void rubahSekon(double jam){
         waktuDetik = jam * 3600;
    }

    public double hitungJarak(){
        return jarakKm = kecepatanMs * waktuDetik / 1000;
    }
        
    public void displayMessage(){
        hitungJarak();
        System.out.println("Mobil anda bermerek : " + manufaktur);
        System.out.println("Nomor plat : " + noPlat);
        System.out.println("Warna : " + warna);
        System.out.println("Mampu menempuh kecepatan " + kecepatankmh + " km");
        System.out.println("Mampu menempuh kecepatan " + kecepatanMs + " m/s");
        System.out.println("Waktu tempuh : " + waktuJam + " Jam");
        System.out.println("Waktu tempuh : " + waktuDetik + " Detik");
        System.out.println("Jarak dalam satuan km : " + jarakKm + " km");
    }
}