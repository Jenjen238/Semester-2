package TinyStore;

public class Pelanggan {

    private String nomorPelanggan;
    private String nama;
    private double saldo;
    private String pin;
    private int gagalLogin;
    private boolean diblokir;

    public Pelanggan(String nomorPelanggan,
        String nama,
        double saldo,
        String pin){

        this.nomorPelanggan = nomorPelanggan;
        this.nama = nama;
        this.saldo = saldo;
        this.pin = pin;
        gagalLogin = 0;
        diblokir = false;
    }

    public String getNomorPelanggan(){
        return nomorPelanggan;
    }

    public String getNama(){
        return nama;
    }

    public double getSaldo(){
        return saldo;
    }

    public boolean isDiblokir(){
        return diblokir;
    }

    private boolean autentikasi(String inputPin){

        if(diblokir){
            return false;
        }

        if(pin.equals(inputPin)){

            gagalLogin = 0;
            return true;

        }else{

            gagalLogin++;

            if(gagalLogin >=3){
                diblokir = true;
            }

            return false;
        }
    }

    public boolean topUp(double jumlah,
        String inputPin){

        if(!autentikasi(inputPin)){
            return false;
        }

        saldo = saldo + jumlah;

        return true;
    }

    public boolean beli(double jumlah,
                        String inputPin){

        if(!autentikasi(inputPin)){
            return false;
        }

        double cashback =
                hitungCashback(jumlah);

        double saldoBaru =
                saldo - jumlah + cashback;

        if(saldoBaru < 10000){
            return false;
        }

        saldo = saldoBaru;

        return true;
    }

    private double hitungCashback(double jumlah){

        String kode =
                nomorPelanggan.substring(0,2);

        if(kode.equals("38")){

            if(jumlah > 1000000){
                return jumlah * 0.05;
            }

            return 0;
        }

        if(kode.equals("56")){

            if(jumlah > 1000000){
                return jumlah * 0.07;
            }

            return jumlah * 0.02;
        }

        if(kode.equals("74")){

            if(jumlah > 1000000){
                return jumlah * 0.10;
            }

            return jumlah * 0.05;
        }

        return 0;
    }

}